
// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로
//  소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.

package practice;

import java.util.Scanner;

public class Practice02 {
    public String solution(String str) {
        String convertStr = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != Character.toUpperCase(c)) {
                c = Character.toUpperCase(c);
                convertStr += c;
            } else {
                c = Character.toLowerCase(c);
                convertStr += c;
            }
        }
        return convertStr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Practice02 p = new Practice02();
        System.out.println(p.solution(str));
    }
}