package dataStructures;

import java.util.Scanner;

public class TwoPointers {

    private static int solution(int n, int m, int[] intArr) {
        int lt = 0, sum = 0, cnt = 0;

        for (int rt = 0; rt < n; rt++) {
            sum += intArr[rt];
            if (sum == m) {
                cnt++;
            }

            while (sum >= m) {
                sum -= intArr[lt++];

                if (sum == m) {
                    cnt++;
                }
            }
        }

        return cnt;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] intArr = new int[n];

        for (int i = 0; i < n; i++) {
            intArr[i] = sc.nextInt();    
        }

        System.out.println(solution(n, m, intArr));

    }
}