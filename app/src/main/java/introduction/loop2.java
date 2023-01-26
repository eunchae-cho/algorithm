package introduction;

import java.util.Scanner;
// 거듭제곱 활용
public class loop2 {
    private static void calcualte(int a, int b, int n) {
        int sum = a;
        for (int i = 0; i < n; i++) {
            sum += Math.pow(2,i) * b;
            System.out.printf("%d ", sum);
        }
        System.out.println();
    }

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            calcualte(a, b, n);
        }
        in.close();
    }
}
