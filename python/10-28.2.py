import urllib.request as ur
from bs4 import BeautifulSoup as bs

url = 'https://media.daum.net/'

soup = bs(ur.urlopen(url).read(), 'html.parser')

print(soup.find_all('div', {"class" : "item_issue"}))

print(soup.find_all('a')[:5])

for i in soup.find_all('a')[:5]:
    print(i.get('href'))

article1 = 'https://news.v.daum.net/v/20200427090630709'

soup2 = bs(ur.urlopen(article1).read(), 'html.parser')

for i in soup2.find_all('p'):
    print(i.text)

f= open('links.txt', 'w')

for i in soup.find_all('div',{"class":"item_issue"}):
    f.write(i.find_all('a')[0].get('href')+'\n')
f.close()

url='https://news.daum.net/'
soup=bs(ur.urlopen(url).read(), 'html.parser')
f= open('article_total.txt', 'w')
for i in soup.find_all('div',{"class":"item_issue"}):
    try:

        f.write(i.text+'\n')

        f.write(i.find_all('a')[0].get('href')+ '\n')

        soup2=bs(ur.urlopen(i.find_all('a')[0].get('href') ).read(), 'html.paerser')

        for j in soup2.find_all('p'):

            f.write(j.text)

    except:
        pass

f.close()