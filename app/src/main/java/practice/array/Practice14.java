package practice.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Practice14 {
    public static void main(String[] args) {
        String letter = ".... . .-.. .-.. ---";
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        Map<String, Character> map = new HashMap<>();
        char alphabet = 97;
        
        for (String st : morse) {
            map.put(st, alphabet++);
        }
        
        answer = Arrays.stream(letter.split(" "))
            .map(i -> String.valueOf(map.get(i)))
            .collect(Collectors.joining());
        
            System.out.println(answer);
    }
}
