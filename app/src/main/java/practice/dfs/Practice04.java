package practice.dfs;

import java.util.Scanner;

public class Practice04 {
    static int[] arr;

    private static int rekursive(int n) {
        if (n == 1) {
            return arr[n] = 1;
        } else if (n == 2) {
            return arr[n] = 1;
        }

        if (arr[n] > 0) {
            return arr[n];
        }

        return arr[n] = rekursive(n - 2) + rekursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        rekursive(n);
        for (int i = 1; i <= n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
