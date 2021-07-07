
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 
// 출력하는 프로그램을 작성하세요.
// 문장속의 각 단어는 공백으로 구분됩니다.
// 첫 줄에 가장 긴 단어를 출력한다. 
// 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
// 단어를 답으로 합니다.

// 다른 해답 (1)
// substring()과 indexOf() 이용
package practice;

import java.util.Scanner;

public class Practice03_1 {
    public String solution(String str) {
        String answer = "";
        int max = Integer.MIN_VALUE, pos;
        while ((pos = str.indexOf(" ")) != -1) {
            String tmp = str.substring(0, pos);
            int leng = tmp.length();
            if (leng > max) {
                max = leng;
                answer = tmp;
            }

            // 앞의 tmp 단어 잘라내고 나머지 새로 str 담기
            str = str.substring(pos + 1);
            if (str.length() > max) {
                answer = str;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Practice03_1 p = new Practice03_1();
        System.out.println(p.solution(str));
    }
}