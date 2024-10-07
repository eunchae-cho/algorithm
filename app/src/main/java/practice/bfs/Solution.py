# 송아지 찾기

from collections import deque

def solution(s, e):
    dis = [1, -1, 5]
    check = [0] * 10001
    q = deque()

    check[s] = 1
    q.append(s)
    level= 1

    while q:
        for i in range(len(q)):
            q_num = q.popleft()
            for j in range(len(dis)):
                sum = q_num + dis[j]
                if sum == e:
                    return level
                if 1 <= sum <= 10000 and check[sum] == 0:
                    check[sum] = 1
                    q.append(sum)
                    print(q)
        level += 1

    return 0

print(solution(5, 14))
