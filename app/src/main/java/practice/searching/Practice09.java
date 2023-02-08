package practice.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice09 {

    private static int solution(int[] arr, int m) {
        Arrays.sort(arr);

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int mid = 0;

        while (lt <= rt) {
            mid = (lt + rt) / 2;
            int sum = 0, cnt = 0;
            for (int i : arr) {
                sum += i;
                if (sum >= mid) {
                    cnt++;
                    sum = i;
                }
            }

            if (cnt == m) {
                return mid;
            }

            if (cnt < m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return mid;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(arr, m));
    }
}
