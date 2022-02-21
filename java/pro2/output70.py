def create_student(name, korean, math, english, science):
    return {
        "name": name,
        "korean": korean,
        "math": math,
        "english": english,
        "science": science
    }
students = [
    create_student("윤인성", 87, 98, 88, 95),
    create_student("연하진", 82, 98, 96, 98),
    create_student("구지연", 76, 96, 94, 90),
    create_student("나선주", 98, 92, 96, 92),
    create_student("윤아린", 85, 98, 98, 98),
    create_student("윤명월", 64, 88, 92, 92),
    create_student("김미화", 82, 86, 98, 88),
    create_student("김연화", 88, 74, 78, 92),
    create_student("박아현", 97, 92, 88, 95),
    create_student("서준석", 45, 52, 72, 78),
]
def student_get_sum(student):
    return student["korean"] + ["math"] + ["english"] + ["science"]

def student_get_average(student):
    return student_get_sum(student) / 4

def student_to_string(student):
    return "{}\t{}\t{}".format(student["name"], student_get_sum(student), student_get_average(student))
 

print("이름", "총점", "평균", sep="\t")
for student in students:
    print(student_to_string(student))