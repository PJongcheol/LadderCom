from flask import Flask, render_template

FlaskApp = Flask(__name__)

@FlaskApp.route("/")
def hello():
    return "<h1>klasse</h1>" 

@FlaskApp.route("/userinfo1/<username>")
def user(username):
    return render_template("userinfo1.html", name=username)

@FlaskApp.route("/userinfo2/<username>/<location>/<age_num>")
def user2(username, location, age_num):
    return render_template("userinfo2.html", name=username, country=location, age=age_num)

if __name__ == "__mian__":
    FlaskApp.run()
