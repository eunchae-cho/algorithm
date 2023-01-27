package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Bracket {

    private static String solution(String st) {
        Stack<Character> stack = new Stack<>();
        String result = "YES";

        for (char ch : st.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    result = "NO";
                    break;
                }
                stack.pop();
            }
        }

        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(solution(st));

        sc.close();
    }
}
