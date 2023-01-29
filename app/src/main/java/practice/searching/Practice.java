package practice.searching;


import java.util.Scanner;

public class Practice {

    static int n;
    static int[] arr;
    static int sum = 0, total = 0;
    static boolean flag = false;
    static String answer = "NO";

    private static void solution(int L, int sum) {
        if (flag) {
            return;
        }

        if (L == n) {
            if (total - sum == sum) {
                flag = true;
                answer = "YES";
            }
        } else {
            solution(L + 1, sum + arr[L]);
            solution(L + 1, sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }

        solution(0, 0);

        sc.close();
    }
}
