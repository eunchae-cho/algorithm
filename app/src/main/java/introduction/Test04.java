package introduction;

public class Test04 {
    static int cnt = 0, min = Integer.MAX_VALUE;

    private static void dfs(int x, int y, int n, int sum) {
        if (sum == y) {
            System.out.println(cnt);
            min = Math.min(cnt, min);
            // cnt = 0;
            return;
        } else if (sum > y) {
            cnt--;
            return;
        } else {
            cnt++;
            System.out.println("+n | sum = " + sum);
            dfs(x, y, n, sum + n);
            cnt++;
            System.out.println("*2 | sum = " + sum);
            dfs(x, y, n, sum * 2);
            cnt++;
            System.out.println("*3 | sum = " + sum);
            dfs(x, y, n, sum * 3);
        }
    }

    public static void main(String[] args) {
        dfs(10, 40, 5, 10);
    }
}
