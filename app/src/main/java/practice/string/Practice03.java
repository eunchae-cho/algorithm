
// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 
// 출력하는 프로그램을 작성하세요.
// 문장속의 각 단어는 공백으로 구분됩니다.
// 첫 줄에 가장 긴 단어를 출력한다. 
// 가장 길이가 긴 단어가 여러개일 경우 문장속에서 가장 앞쪽에 위치한
// 단어를 답으로 합니다.

package practice.string;

import java.util.Scanner;

public class Practice03 {
    public String solution(String str) {
        String answer = "";

        String[] strArr = str.split(" ");
        int big = 0;
        for (String s : strArr) {
            if (s.length() > big) {
                big = s.length();
                answer = s;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Practice03 p = new Practice03();
        System.out.println(p.solution(str));
    }
}