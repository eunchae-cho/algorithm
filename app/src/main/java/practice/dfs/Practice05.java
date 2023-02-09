package practice.dfs;

public class Practice05 {
    static int[] arr;
    static int num;

    private static void DFS(int n) {
        if (n == num + 1) {
            String str = "";

            for (int i = 1; i <= num; i++) {
                if (arr[i] == 1) {
                    str += i + " ";
                }
            }

            System.out.println(str);

        } else {
            arr[n] = 1;
            DFS(n + 1);
            arr[n] = 0;
            DFS(n + 1);
        }
    }

    public static void main(String[] args) {

        num = 3;
        arr = new int[num + 1];
        DFS(1);
    }
}
