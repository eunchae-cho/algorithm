// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
// 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
//추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.

package practice.string;

import java.util.Scanner;

public class Practice10 {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e') {
                cnt = 0;
                answer[i] = cnt;
            } else {
                answer[i] = ++cnt;
            }
        }

        cnt = 0;
        for (int j = str.length() - 1; j >= 0; j--) {
            if (str.charAt(j) == 'e') {
                cnt = 0;
            } else {
                cnt++;
                if (answer[j] > cnt) {
                    answer[j] = cnt;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char t = sc.next().charAt(0);
        for (int value : new Practice10().solution(str, t)) {
            System.out.print(value + " ");
        }
    }
}