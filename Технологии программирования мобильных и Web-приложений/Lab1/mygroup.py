groupmates = [
    {
        "name": "Екатерина",
        "surname": "Иванова",
        "exams": ["СОС", "ИС", "ТО"],
        "marks": [5, 5, 5]
    },
    {
        "name": "Михаил",
        "surname": "Каргальцев",
        "exams": ["СОС", "ИС", "ТО"],
        "marks": [5, 5, 5]
    },
    {
        "name": "Илья",
        "surname": "Галузинский",
        "exams": ["СОС", "ИС", "ТО"],
        "marks": [5, 5, 4]
    },
      {
        "name": "Анатолий",
        "surname": "Кустов",
        "exams": ["СОС", "ИС", "ТО"],
        "marks": [4, 4, 4]
    },
    {
        "name": "Ефим",
        "surname": "Андреев",
        "exams": ["СОС", "ИС", "ТО"],
        "marks": [5, 5, 5]
    }
]


def print_students(students):
    print(u"Имя".ljust(15), u"Фамилия".ljust(10), u"Экзамены".ljust(30), u"Оценки".ljust(20))
    for student in students:
        print(student["name"].ljust(15), student["surname"].ljust(10), str(student["exams"]).ljust(30), str(student["marks"]).ljust(20))
print_students(groupmates)

