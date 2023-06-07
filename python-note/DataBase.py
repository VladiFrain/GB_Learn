import json
from Note import Note
from datetime import datetime
import os.path


class Database:

    def __init__(self, filename) -> None:
        self.data = dict()
        self.maxId = 0
        self.readDatabase(filename)

    def printBase(self, datefilter=0):
        if not datefilter == 0:
            dayStart = datetime.combine(
                datefilter.date(), datefilter.min.time())
            dayEnd = datetime.combine(datefilter.date(), datefilter.max.time())
            print(f"Показаны записи за дату {datefilter.date()}:")
            filterDate = True
        else:
            filterDate = False

        for key, value in self.data.items():
            if filterDate:
                if (value.date < dayStart or value.date > dayEnd):
                    continue

            print(f"{key}: {value.shortInfo()}")

    def updateNote(self, index, note, update=True):
        if update:
            note.date = datetime.now()
        if index == 0:
            index = self.maxId + 1
        self.data[index] = note
        if index > self.maxId:
            self.maxId = index

    def getCount(self):
        return len(self.data)

    def addNew(self, item):
        self.maxId += 1
        self.data[self.maxId] = item

    def getByIndex(self, index):
        return self.data.get(index)

    def delByIndex(self, index):
        if self.data.get(index) == None:
            return
        else:
            self.data.pop(index)

    def readDatabase(self, filename):
        checkfile = os.path.exists(filename)
        if not checkfile:
            return

        with open(filename) as file:
            self.data.clear()
            d = json.load(file)
            for key in d:
                item = d[key]
                head = body = date = ""
                if "head" in item:
                    head = item["head"]
                if "body" in item:
                    body = item["body"]
                if "date" in item:
                    date = datetime.fromisoformat(item["date"])

                note = Note(head, body, date)
                self.updateNote(int(key), note, False)

    def __str__(self) -> str:
        result = ""
        for key, value in self.data.items():
            item = "id: {id} date: {date} head: {head} body: {body}".format(
                id=key, date=value.date, head=value.head, body=value.body)
            result = result + item + "\n"
        return result

    def saveDatabase(self, filename):
        with open(filename, "w") as file:
            values = self.data.values()
            json.dump(self.data, file, default=encodeNote, indent=4)


def encodeNote(note):
    if isinstance(note, Note):
        return note.__dict__
    elif isinstance(note, datetime):
        return str(note)
    else:
        print(type(note))
        return type(note)
