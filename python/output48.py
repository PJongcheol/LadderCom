import time

output = 0
Target_tick = time.time() + 5
while time.time() < Target_tick:
    output += 1
print("5초 동안 반복한 횟수:", output)

print("현재 유닉스 타임:", time.time())