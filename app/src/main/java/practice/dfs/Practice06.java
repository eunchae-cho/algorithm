package practice.dfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Practice06 {
    static int[] check;
    static int[] dis = { 1, -1, 5 };

    private static int BFS(int s, int e) {
        int level = 0;
        check = new int[10001];
        check[s] = 1;

        Queue<Integer> q = new LinkedList<>();
        q.offer(s);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int x = q.poll();
                for (int j : dis) {
                    int nx = x + j;
                    if (nx == e) {
                        return level + 1;
                    }
                    if (nx >= 1 && nx <= 10000 && check[nx] == 0) {
                        check[nx] = 1;
                        q.offer(nx);
                    }
                }
            }
            level++;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        System.out.println(BFS(s, e));
    }
}
