
// 피보나치 수열

// 1) 피보나치 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
// 2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.

package practice.array;

import java.util.Scanner;

public class Practice04 {
    public int[] solution(int num) {
        int[] answer = new int[num];
        answer[0] = 1;
        answer[1] = 1;

        for (int i = 0; i < num - 2; i++) {
            answer[i + 2] = answer[i] + answer[i + 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int val : new Practice04().solution(num)) {
            System.out.print(val + " ");
        }
    }
}