package practice.dfs;

import java.util.Scanner;

public class Practice07 {
    static int cnt = 0;

    private static int DFS(int[][] arr, int[] check, int n, int V) {
        check[1] = 1;

        if (V == n) {
            cnt++;
        } else {
            for (int i = 0; i < n; i++) {
                if (arr[V][i] == 1 && check[i] == 0) {
                    check[i] = 1;
                    DFS(arr, check, n, i);
                    check[i] = 0;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n + 1][m + 1];
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
        }
        int[] check = new int[n + 1];
        System.out.println(DFS(arr, check, n, 1));
        sc.close();
    }
}
