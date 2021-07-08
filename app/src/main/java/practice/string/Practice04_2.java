
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

// 다른 해답 (2)
// 글자 직접 뒤집기
// 양 끝의 문자를 각각 교환
package practice.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice04_2 {
    public ArrayList<String> solution(int num, String[] strArr) {
        ArrayList<String> anwser = new ArrayList<>();
        for (String s : strArr) {
            char[] charArr = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;

            while (lt < rt) {
                char tmp = charArr[lt];
                charArr[lt] = charArr[rt];
                charArr[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(charArr);
            anwser.add(tmp);
        }
        return anwser;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = sc.next();
        }
        for (String s : new Practice04_2().solution(num, strArr)) {
            System.out.println(s);
        }
    }
}