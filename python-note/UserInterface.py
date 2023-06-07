from DataBase import Database
from Note import Note
from datetime import datetime


class UserInterface:
    def __init__(self, database) -> None:
        self.userHere = True
        self.base = database

    def updateCount(self):
        self.count = self.base.getCount()

    def start(self):
        self.updateCount()
        print("\nЗаписей в базе: ", self.count)
        print("0 - выход")
        print("1 - новая запись")
        if self.count > 0:
            print("2 - показать заголовки")
            print("3 - выбрать запись")
            print("4 - выбрать дату")

        userChoice = int(input("Выберите пункт меню:"))
        if (userChoice == 0):
            self.userHere = False
            return
        elif userChoice == 1:
            self.editNote(0)
        elif userChoice == 2:
            self.showNotes()
        elif userChoice == 3:
            self.askNoteIndex()
        elif userChoice == 4:
            self.askDateFilter()

    def askDateFilter(self):
        inputDate = input("Введите дату в формате DD-MM-YYYY: ")
        try:
            userDate = datetime.strptime(inputDate, "%d-%m-%Y")
            self.showNotes(userDate)

        except ValueError:
            print("Неверный формат даты")

    def showNotes(self, userdate=0):
        print()
        self.base.printBase(userdate)

    def editNote(self, index):
        head = input("Заголовок: ")
        body = input("Тело: ")
        self.updateNote(index, Note(head, body))

    def updateNote(self, index, note):
        self.base.updateNote(index, note)
        self.updateCount()

    def showNote(self, index=0):
        note = self.base.getByIndex(index)
        if note == None:
            print("Нет такой записи")
            return
        print("\nЗапись №", index)
        self.printNote(note)
        print("0 - вернуться к выбору записи")
        print("1 - редактировать запись")
        print("2 - удалить запись")
        userChoice = int(input("Выберите пункт меню:"))
        if (userChoice == 0):
            return
        elif userChoice == 1:
            self.editNote(index)
        elif userChoice == 2:
            self.deleteNote(index)

    def deleteNote(self, index):
        self.base.delByIndex(index)

    def printNote(self, note):
        note.printNote()

    def askNoteIndex(self):
        noteindex = int(input("Введите номер записи: "))
        self.showNote(noteindex)
