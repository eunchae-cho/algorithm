package dataStructures;

import java.util.Scanner;

public class Sequence {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }

        int sum = 0, lt = 0, cnt = 0;

        for (int rt = 0; rt < num / 2 + 1; rt++) {

            sum += arr[rt];
            if (sum == num) {
                cnt++;
            }
            
            while (sum >= num) {
                sum -= arr[lt++];

                if (sum == num) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

        sc.close();
    }
}
