from DataBase import Database
from UserInterface import UserInterface

filename = "data.json"
base = Database(filename)
userInterface = UserInterface(base)
while userInterface.userHere:
    userInterface.start()
base.saveDatabase(filename)