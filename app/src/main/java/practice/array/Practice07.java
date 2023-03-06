package practice.array;
import java.util.regex.Pattern;

public class Practice07 {
    public static void main(String[] args) {
        String my_string = "nice to meet you";
        System.out.println(Pattern.compile("[a|e|i|o|u]+").matcher(my_string).replaceAll(""));
    }
}