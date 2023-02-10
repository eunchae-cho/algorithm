package practice.dfs;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice08 {
    static int cnt = 0;

    private static int DFS(ArrayList<ArrayList<Integer>> list, int[] check, int n, int V) {
        check[1] = 1;

        if (V == n) {
            cnt++;
        } else {
            for (int i : list.get(V)) {
                if (check[i] == 0) {
                    check[i] = 1;
                    DFS(list, check, n, i);
                    check[i] = 0;
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
        }
        int[] check = new int[n + 1];
        System.out.println(DFS(list, check, n, 1));
        sc.close();
    }
}
