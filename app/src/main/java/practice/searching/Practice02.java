package practice.searching;

import java.util.Scanner;

public class Practice02 {

    static int answer = 0, n = 0, m = 0;
    static int[][] gragh;
    static int[] arr;

    private static int DFS(int num) {
        if (num == n) {
            answer++;
        } else {
            for (int i = 1; i <= n; i++) {
                if (gragh[num][i] == 1 && arr[i] == 0) {
                    arr[i] = 1;
                    DFS(i);
                    arr[i] = 0;
                }
            }
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        gragh = new int[n + 1][n + 1];
        arr = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            gragh[a][b] = 1;
        }

        arr[1] = 1;
        DFS(1);
        System.out.println(answer);
        sc.close();
    }
}
