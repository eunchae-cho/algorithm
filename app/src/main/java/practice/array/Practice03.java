
// 가위 바위 보

// A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
// A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

package practice.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice03 {
    public ArrayList<String> solution(int[] numArr1, int[] numArr2) {
        ArrayList<String> answer = new ArrayList<>();

        for (int i = 0; i < numArr1.length; i++) {
            if (numArr1[i] == numArr2[i]) {
                answer.add("D");
            } else if (numArr1[i] == 1 && numArr2[i] == 3) {
                answer.add("A");
            } else if (numArr1[i] == 2 && numArr2[i] == 1) {
                answer.add("A");
            } else if (numArr1[i] == 3 && numArr2[i] == 2) {
                answer.add("A");
            } else {
                answer.add("B");
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr1 = new int[num];
        for (int i = 0; i < num; i++) {
            numArr1[i] = sc.nextInt();
        }
        int[] numArr2 = new int[num];
        for (int i = 0; i < num; i++) {
            numArr2[i] = sc.nextInt();
        }
        for (String s : new Practice03().solution(numArr1, numArr2)) {
            System.out.println(s);
        }
    }
}