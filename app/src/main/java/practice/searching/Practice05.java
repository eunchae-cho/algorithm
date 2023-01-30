package practice.searching;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Practice05 {
    
    static Integer[] arr;
    static int N, rest;
    static int answer = Integer.MAX_VALUE;

    private static void solution(int L, int sum) {
       if (sum > rest) {
           return;
        }

        if (L >= answer) {
            return;
        }


        if (sum == rest) {
            answer = Math.min(answer, L);
       } else {
           for (int i = 0; i < N; i++) {
            solution(L + 1, sum + arr[L]);
           }
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        rest = sc.nextInt();

        solution(0, 0);

        System.out.println(answer);

        sc.close();
    }
}
