package practice.dfs;

import java.util.Scanner;

public class Practice03 {
    private static int rekursive(int n) {
        if (n == 0) {
            return 1;
        }

        return n * rekursive(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rekursive(n));
    }
}
