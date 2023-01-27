package dataStructures;

import java.util.Scanner;

public class SlidingWindow {
    
    private static int solution(int a, int b, int[] arr) {
        int max = 0, sum = 0;

        for (int i = 0; i < b; i++) {
            max += arr[i];
        }
        sum = max;
        for (int i = b; i < arr.length; i++) {
            sum += arr[i] - arr[i - b];
            max = Math.max(max, sum);
        }

        return max;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(a, b, arr));
        
    }
}
