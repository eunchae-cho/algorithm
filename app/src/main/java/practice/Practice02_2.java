
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
//  소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

// 아스키 코드를 이용한 다른 해답 (2)
// 대문자 - 65 ~ 90
// 소문자 - 97 ~ 122
// 대문자와 소문자의 숫자 차이 32를 이용
package practice;

import java.util.Scanner;

public class Practice02_2 {
    public String solution(String str) {
        String answer = "";
        for (char c : str.toCharArray()) {
            if (c > 97 && c <= 122) {
                answer += (char) (c - 32);
            } else {
                answer += (char) (c + 32);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Practice02_2 p = new Practice02_2();
        System.out.println(p.solution(str));
    }
}