package dataStructures;

import java.util.Scanner;

public class SubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] intArr = new int[size];
        
        for (int i = 0; i < size; i++) {
            intArr[i] = sc.nextInt();
        }
        
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum = intArr[i];
            for (int j = i; j < intArr.length; j++) {
                
                if (i != j) { 
                    sum += intArr[j];
                }
                
                if (sum < 0) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}
