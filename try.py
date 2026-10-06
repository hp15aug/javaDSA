n = 3
k = 4

ans = [[0 for _ in range(n)] for _ in range(n)]

if not (n <= k <= 2*n - 1):
    print(-1)
else:
    for i in range(2*n - k):
        ans[i][i] = i + 1
    cur = 2 * n - k + 1
    for i in range(n):
        for j in range(n):
            if ans[i][j] == 0:
                ans[i][j] = cur
                cur += 1

    for i in range(n):
        for j in range(n):
            print(ans[i][j], end=' ')
        print()
    