package practice.searching;

import java.util.Scanner;

public class Practice03 {

    static int w, n;
    static int answer = Integer.MIN_VALUE;

    private static void solution(int L, int sum, int[] arr) {
        if (sum > w) {
            return;
        }

        if (L == n) {
            answer = Math.max(answer, sum);
        } else {

            solution(L + 1, sum + arr[L], arr);
            solution(L + 1, sum, arr);            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        w = sc.nextInt();
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        solution(0, 0, arr);
        System.out.println(answer);

        sc.close();
    }
}
