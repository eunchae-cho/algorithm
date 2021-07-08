
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

// 다른 해답 (1)
// StringBuilder, reverse() 이용
package practice.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice04_1 {
    public ArrayList<String> solution(int num, String[] strArr) {
        ArrayList<String> anwser = new ArrayList<>();
        for (String s : strArr) {
            String tmp = new StringBuilder(s).reverse().toString();
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
        for (String s : new Practice04_1().solution(num, strArr)) {
            System.out.println(s);
        }
    }
}