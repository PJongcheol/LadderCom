import pymysql
from tkinter import Canvas, Tk, messagebox, Menu
from tkinter.simpledialog import *
import random

def connectMySQL():
    global conn, curr, window, canvas
    conn = pymysql.connect(host='127.0.0.1', user='root', password='12341234', db='kingHotDB', charset='utf8')
    curr = conn.cursor()

def closeMySQL():
    global conn, curr, window, canvas
    curr.close()
    conn.close()
    curr, conn = None, None

def randomColor():
    COLORS = ["black", "red", "green", "blue", "magenta", "orange", "brown", "maroon", "coral"]
    return random.choice(COLORS)

def clearMap():
    global conn, curr, window, canvas
    canvas.destroy()
    canvas = Canvas(window, height=SCR_HEIGHT, width=SCR_WIDTH)
    canvas.pack()

def displayRestaurant():
    global conn, curr, window, canvas
    connectMySQL()

    sql = "SELECT restName, ST_AsText((ST_Buffer(restLocation, 3))) FROM Restaurant"
    curr.execute(sql)

    while True:
        row = curr.fetchone()
        if not row:
            break
        restName, gisStr = row
        start = gisStr.index('(')
        start = gisStr.index('(', start + 1)
        start += 1
        end = gisStr.index(')')
        gisStr = gisStr[start:end]
        gisList = gisStr.split(',')
        newGisList = []

        for xyStr in gisList:
            x, y = xyStr.split(' ')
            x, y = float(x), float(y)
            xyList = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)
        
        myColor = randomColor()
        canvas.create_line(newGisList, fill=myColor, width=3)
        tx, ty = xyList[0], xyList[1]+15
        canvas.create_text([tx, ty], fill=myColor, text=restName.split(' ')[2])
    
    closeMySQL()

def displayManager():
    global conn, curr, window, canvas
    connectMySQL()
    
    sql = "SELECT ManagerName, ST_AsText(Area) FROM Manager OEDER BY ManagerName"
    curr.execute(sql)

    while True:
        row = curr.fetchone()
        if not row:
            break
        managerName, gisStr = row
        start = gisStr.index('(')
        start = gisStr.index('(', start + 1)
        start += 1
        end = gisStr.index(')')
        gisStr = gisStr[start:end]
        gisList = gisStr.split(',')
        newGisList = []
        for xyStr in gisList:
            x, y = xyStr.split(' ')
            x, y = float(x), float(y)
            xyList = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)
        
        canvas.create_polygon(newGisList, fill=randomColor())
    
    closeMySQL()

def displayRoad():
    global conn, curr, window, canvas
    connectMySQL()

    sql = "SELECT RoadName, ST_AsText(ST_BUFFER(RoadLine, 2)) FROM Road"
    curr.execute(sql)

    while True:
        row = curr.fetchone()
        if not row:
            break
        managerName, gisStr = row
        start = gisStr.index('(')
        start = gisStr.index('(', start + 1)
        start += 1
        end = gisStr.index(')')
        gisStr = gisStr[start:end]
        gisList = gisStr.split(',')
        newGisList = []
        for xyStr in gisList:
            x, y = xyStr.split(' ')
            x, y = float(x), float(y)
            xyList = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)

        canvas.create_polygon(newGisList, fill=randomColor())
    
    closeMySQL()

def showResMan():
    global conn, curr, window, canvas

    displayRestaurant()

    connectMySQL()
    sql = "SELECT M.ManagerName, R.restName, ST_AsText((ST_Buffer(R.restLocation, 3))) FROM Restaurant R, Manager M"
    sql +=" WHERE ST_Contains(M.area, R.restLocation) = 1 ORDER BY R.restName"

    curr.execute(sql)

    saveRest = ''
    while True:
        row = curr.fetchone()
        if not row:
            break
        
        managerName, restName, gisStr = row
        start = gisStr.index('(')
        start = gisStr.index('(', start + 1)
        start += 1
        end = gisStr.index(')')
        gisStr = gisStr[start:end]
        gisList = gisStr.split(',')
        newGisList = []
        for xyStr in gisList:
            x, y = xyStr.split(' ')
            x, y = float(x), float(y)
            xyList = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]
            newGisList.append(xyList)
        
        myColor = randomColor()
        if saveRest == restName:
            canvas.create_polygon(newGisList, fill=myColor)

        if saveRest == restName:
            tx, ty = xyList[0], xyList[1]+45
        else:
            tx, ty = xyList[0], xyList[1]+30
        
        canvas.create_text([tx, ty], fill=myColor, text=managerName)
        saveRest = restName

    closeMySQL()

def showNearest():
    global conn, curr, window, canvas

    baseRest = '????????? ??????' + askstring('?????? ?????????', '????????? ????????? ???????????????') + '??????'

    connectMySQL()
    sql = "SELECT ST_AsText(R2.restLocation), ST_Distance(R1.restLocation, R2.restLocation) "
    sql += "FROM Restaurant R1, Restaurant R2"
    sql += "WHERE R1.restName='" + baseRest +  "' "
    sql += "ORDER BY ST_Distance(R1.restLocation, R2.restLocation)"
    curr.execute(sql)

    row = curr.fetchone()
    gisStr, distance = row
    start = gisStr.index('(')
    start += 1
    end = gisStr.index(')')
    gisStr = gisStr[start:end]
    x, y = list(map(float, gisStr.split(' ')))
    baseXY = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]

    lineWidth = 20
    while True:
        row = curr.fetchone()
        if not row:
            break
        gisStr, distance = row
        start = gisStr.index('(')
        start += 1
        end = gisStr.index(')')
        gisStr = gisStr[start:end]
        x, y = list(map(float, gisStr.split(' ')))
        targetXY = [ (x+90)*2, SCR_HEIGHT-(y+90)*2]

        myColor = randomColor()
        if lineWidth < 0:
            lineWidth = 0
        canvas.create_line([baseXY, targetXY], fill=myColor, width=lineWidth)
        lineWidth -= 5
    
    closeMySQL()

    displayRestaurant()

conn, curr = None, None
window, canvas = None, None

SCR_WIDTH, SCR_HEIGHT = 360, 360

window = Tk()
window.title("????????? ?????? ver 0.1")
canvas = Canvas(window, height=SCR_HEIGHT, width=SCR_WIDTH)
canvas.pack()

mainMenu = Menu(window)
window.config(menu=mainMenu)

gis1Menu = Menu(mainMenu)
mainMenu.add_cascade(label="GIS ????????? ??????", menu=gis1Menu)
gis1Menu.add_command(label="????????? ??????", command=displayRestaurant)
gis1Menu.add_command(label="?????????", command=displayManager)
gis1Menu.add_command(label="?????? ??????", command=displayRoad)
gis1Menu.add_separator()
gis1Menu.add_command(label="?????? ?????????", command=clearMap)
gis1Menu.add_separator()

gis2Menu = Menu(mainMenu)
mainMenu.add_cascade(label="GIS ????????? ??????", menu=gis2Menu)
gis2Menu.add_command(label="???????????? ?????? ?????????", command=showResMan)
gis2Menu.add_command(label="?????? ????????? ?????????", command=showNearest)

window.mainloop()
