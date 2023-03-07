package practice.array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Practice09 {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 3, 6, 7, 9};
        // arr = Arrays.stream(arr).filter(i -> i % 3 == 0).toArray();
        // for (int j : arr) {
        //     System.out.println(j);
        // }
        int b = 29183;
        int k = 3;
        int[] arr = Arrays.stream(String.valueOf(b).split("")).mapToInt(Integer::parseInt).toArray();
        int a =  IntStream.range(0, arr.length).filter(i -> arr[i] == k).findFirst().orElse(-1);
        System.out.println(a);

        String st = "bcA";
        String st2 = Arrays.stream(st.split("")).map(i -> i.toLowerCase()).sorted().collect(Collectors.joining());
        System.out.println(st2);
    }
}
