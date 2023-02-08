package practice.searching;

import java.util.Arrays;
import java.util.Scanner;

public class Practice08 {

    private static int solution(int[] arr, int m) {
        Arrays.sort(arr);

        int lt = 0;
        int rt = arr.length - 1;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;
            if (arr[mid] == m) {
                return mid + 1;
            }
            if (arr[mid] > m) {
                rt = mid - 1;
            } else {
                lt = mid + 1;
            }
        }

        return -1;
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
