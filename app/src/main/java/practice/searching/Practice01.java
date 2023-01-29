package practice.searching;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice01 {
    
    private static int BFS(int s, int e) {
        int answer = 0;
        int[] dis = {1, -1, 5};
        int[] ch;

        Queue<Integer> q = new LinkedList<>();
        ch = new int[10001];
        ch[s] = 1;
        q.offer(s);

        while(!q.isEmpty()) {
            for (int i = 0; i < q.size(); i++) {
                int x = q.poll();
                for (int j = 0; j < dis.length; j++) {
                    int nx = x + dis[j];
                    if (nx == e) return answer;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        q.offer(nx);
                    }
                }
                answer++;
            }
        }
        return 0;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(BFS(s, e));

        sc.close();
    }
}
