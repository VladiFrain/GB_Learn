'''
Напишите функцию read_last(lines, file), которая будет открывать определенный файл file и выводить на печать построчно последние строки в количестве lines 
(на всякий случай проверим, что задано положительное целое число). Протестируем функцию на файле «article.txt» со следующим содержимым:
Вечерело
Жужжали мухи
Светил фонарик
Кипела вода в чайнике
Венера зажглась на небе
Деревья шумели
Тучи разошлись
Листва зеленела
'''


def read_last(lines, file):
    with open(file, 'r', encoding='UTF-8') as file:
        lines_list = file.readlines()
        lines_list = list(map(lambda s: s.strip(), lines_list))
        for i in range(len(lines_list) - lines, len(lines_list)):
            print(lines_list[i])


read_last(4, 'article.txt')

'''
Документ «article.txt» содержит следующий текст:
Вечерело
Жужжали мухи
Светил фонарик
Кипела вода в чайнике
Венера зажглась на небе
Деревья шумели
Тучи разошлись
Листва зеленела

Требуется реализовать функцию longest_words(file), которая выводит слово, имеющее максимальную длину (или список слов, если таковых несколько).
'''


def longest_words(file):
    with open(file, 'r', encoding='UTF-8') as file:
        lines_list = file.readlines()
        lines_list = list(map(lambda s: s.strip(), lines_list))
        new_list = []
        new_dict = {}
        for el in lines_list:
            new_list += el.split()
        for el in new_list:
            new_dict[el] = len(el)
        max_len = 0
        str = ''
        for k, v in new_dict.items():
            if v > max_len:
                max_len = v
                str = k
        print(str)


longest_words('article.txt')

'''
ДОП ЗАДАЧА.
Классическая задача про бассейн, который заполняется через 3 трубы, слишком проста. У нас труб будет больше.

Бассейн можно заполнить из N труб. В файле pipes.txt записаны времена заполнения всего бассейна только одной данной работающей трубой (в часах). 
Затем после пустой строки перечислены трубы, которые будут заполнять бассейн. Сколько минут на это потребуется?

Номер трубы соответствует номеру строки, в которой записана ее производительность.

Результат запишите в файл time.txt

Пример
Ввод

1
2
3
(пустая строка)
1 2 3

Вывод
32.72727272727273
'''
