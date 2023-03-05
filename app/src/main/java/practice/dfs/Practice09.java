package practice.dfs;

import java.util.Scanner;

public class Practice09 {
    static int result = 0;
    static int m;

    private static int DFS(int[] sArr, int[] tArr, int sSum, int tSum, int L) {
        if (tSum > m) {
            return result;
        }

        result = Math.max(sSum, result);

        if (L == sArr.length) {
            return result;
        } else {
            DFS(sArr, tArr, sSum + sArr[L], tSum + tArr[L], L + 1);
            DFS(sArr, tArr, sSum, tSum, L + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        m = sc.nextInt();
        int[] sArr = new int[n];
        int[] tArr = new int[n];
        for (int i = 0; i < n; i++) {
            sArr[i] = sc.nextInt();
            tArr[i] = sc.nextInt();
        }
        System.out.println(DFS(sArr, tArr, 0, 0, 0));
        sc.close();
    }
}
