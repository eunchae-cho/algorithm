package practice.array;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Practice12 {
    public static void main(String[] args) {
        
        String st = "bcA";
        String st2 = Arrays.stream(st.split("")).map(i -> i.toLowerCase()).sorted().collect(Collectors.joining());
        System.out.println(st2);
    }
}
