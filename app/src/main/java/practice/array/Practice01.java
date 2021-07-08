
// 큰 수 출력하기

// N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
// (첫 번째 수는 무조건 출력한다)

package practice.array;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice01 {
    public ArrayList<Integer> solution(int[] numArr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(numArr[0]);

        for (int i = 1; i < numArr.length; i++) {
            if (numArr[i] > numArr[i - 1]) {
                answer.add(numArr[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] numArr = new int[num];
        for (int i = 0; i < num; i++) {
            numArr[i] = sc.nextInt();
        }

        for (int val : new Practice01().solution(numArr)) {
            System.out.print(val + " ");
        }
    }
}