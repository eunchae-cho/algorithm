package practice.array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 6, 7, 9};
        arr = Arrays.stream(arr).filter(i -> i % 3 == 0).toArray();
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
