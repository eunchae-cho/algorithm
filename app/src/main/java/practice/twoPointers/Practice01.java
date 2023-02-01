package practice.twoPointers;

import java.util.Scanner;

public class Practice01 {
    private static int solution(int num) {
        int cnt = 0;
        int p1 = 1, sum = 1;

        for (int p2 = 2; p2 <= num; p2++) {
            sum += p2;

            if (sum == num) {
                cnt++;
                while (sum >= num) {
                    sum -= p1++;

                    if (sum == num) {
                        cnt++;
                    }
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(solution(num));
    }
}
