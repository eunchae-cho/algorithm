
// N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

package practice.string;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice04 {
    public ArrayList<String> solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        for (int i = 0; i < strArr.length; i++) {
            String word = "";
            for (int j = strArr[i].length() - 1; j >= 0; j--) {
                word += strArr[i].charAt(j);
            }
            strList.add(word);
        }
        return strList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        String[] strArr = new String[num];
        for (int i = 0; i < num; i++) {
            strArr[i] = sc.next();
        }
        for (String s : new Practice04().solution(strArr)) {
            System.out.println(s);
        }
    }
}