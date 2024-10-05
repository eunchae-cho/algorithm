# LIS - 최대 부분 증가 수열

def solution(arr):
    dy = []
    for i in range(len(arr)):
        dy.append(1)
        max_value = 0
        for j in range(i - 1, -1, -1):
            if (arr[j] < arr[i]):
                max_value = max(max_value, dy[j])
        dy[i] += max_value

    return max(dy)

print(solution([5,3,7,8,6,2,9,4]))