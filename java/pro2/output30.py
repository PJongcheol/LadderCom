list_b = [0, 1, 2, 3, 4, 5, 6]
del list_b[3:6]
print()

print("del list_b[3:6]:", list_b)

list_c = [0, 1, 2, 3, 4, 5, 6]
list_d = [0, 1, 2, 3, 4, 5, 6]
del list_c[:3]
del list_d[3:]
print()

print("del list_c[:3]:", list_c)
print("del list_d[3:]:", list_d)