package practice.dfs;

import java.util.Scanner;

public class Practice02 {
    private static void rekursive(int n) {
        if (n == 0) {
            return;
        }

        rekursive(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        rekursive(n);
    }
}
