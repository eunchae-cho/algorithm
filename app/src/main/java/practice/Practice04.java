
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

package practice;

import java.util.Scanner;

public class Practice04 {
    public String solution(String[] strArr) {
        String answer = "";

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] strArr = new String[num];
        for (int i = 0; i <= num; i++) {
            strArr[i] = sc.next();
        }
        System.out.println(new Practice04().solution(strArr));
    }
}