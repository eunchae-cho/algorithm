package practice.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Practice11 {
    public static void main(String[] args) {
        int b = 29183;
        int k = 3;
        int[] arr = Arrays.stream(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        int a =  IntStream.range(0, arr.length).filter(i -> arr[i] == k).findFirst().orElse(-1);
        System.out.println(a);
    }
}
