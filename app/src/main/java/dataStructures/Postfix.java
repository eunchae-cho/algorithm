package dataStructures;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {

    private static int solution(String str) {
        Stack<Integer> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(Integer.parseInt(String.valueOf(ch)));
            } else {
                int right = stack.pop();
                int left = stack.pop();
                if (ch == '+') {
                    stack.push(left + right);
                } else if (ch == '-') {
                    stack.push(left - right);
                } else if (ch == '*') {
                    stack.push(left * right);
                } else if (ch == '/') {
                    stack.push(left / right);
                }
            }
        }

        return stack.pop();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();

        System.out.println(solution(str));

        sc.close();
    }
}
