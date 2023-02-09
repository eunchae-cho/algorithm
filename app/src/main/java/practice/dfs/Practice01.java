package practice.dfs;

import java.util.Scanner;

public class Practice01 {
    private static void rekursive(int n) {
        if (n == 0) {
            return;
        }

        rekursive(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rekursive(n);
    }
}
