package practice.searching;

import java.util.Scanner;

public class Practice04 {
    
    static int[] scores ,min;
    static int N, M, answer;
    
    private static void solution(int L, int scoreSum, int minSum) {
        if (minSum > M) {
            return;
        }

        if (L == N) {
            answer = Math.max(answer, scoreSum);
        } else {
            solution(L + 1, scoreSum + scores[L], minSum + min[L]);
            solution(L + 1, scoreSum, minSum);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        scores = new int[N];
        min = new int[N];
 
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
            min[i] = sc.nextInt();
        }

        solution(0, 0, 0);

        System.out.println(answer);

        sc.close();
    }
}
