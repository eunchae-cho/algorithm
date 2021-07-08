
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
//  소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

// 다른 해답 (1)
package practice.string;

import java.util.Scanner;

public class Practice02_1 {
    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer += Character.toUpperCase(c);
            } else {
                answer += Character.toLowerCase(c);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Practice02_1 p = new Practice02_1();
        System.out.println(p.solution(str));
    }
}