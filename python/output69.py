students = [
    { "name": "윤인성", "Korean": 87, "math": 98, "english": 88, "science": 95 },
    { "name": "연하진", "Korean": 92, "math": 98, "english": 96, "science": 98 },
    { "name": "구지연", "Korean": 76, "math": 96, "english": 94, "science": 90 },
    { "name": "나석주", "Korean": 98, "math": 92, "english": 96, "science": 92 },
    { "name": "윤아린", "Korean": 95, "math": 98, "english": 98, "science": 98 },
    { "name": "윤명월", "Korean": 64, "math": 98, "english": 92, "science": 92 },
    { "name": "김미화", "Korean": 82, "math": 86, "english": 98, "science": 88 },
    { "name": "김연화", "Korean": 88, "math": 74, "english": 78, "science": 92 },
    { "name": "박아현", "Korean": 97, "math": 92, "english": 88, "science": 95 },
    { "name": "서준서", "Korean": 45, "math": 52, "english": 72, "science": 78 }
]
print("이름", "총점", "평균", sep="\t")
for student in students:
    score_sum = student["Korean"] + student["math"] + student["english"] + student["science"]
    socre_average = score_sum / 4
    print(student["name"], score_sum, socre_average, sep="\t")