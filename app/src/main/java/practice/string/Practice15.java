package practice.string;

import java.util.Arrays;

public class Practice15 {
    public static void main(String[] args) {
        char[] arr = { 'b', 'c', 'a' };
        Arrays.sort(arr);
        for (char c : arr) {
            System.out.print(c + " ");
        }
    }
}
