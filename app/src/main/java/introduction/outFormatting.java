package introduction;

import java.util.Scanner;

//================================
//        java           100
//        cpp            065
//        python         050
//================================
public class outFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String sl = sc.next();
            int in = sc.nextInt();

            System.out.printf("%-15s%03d\n", sl, in);
        }

        System.out.println("================================");

    }
}
