package practice.string;

import java.util.Scanner;

public class Practice13 {
    public void execute(int in, String str) {
        int splitNum = str.length() / 4;
        for (int i = 0; i < in; i++) {
            int parseInt = Integer.parseInt(str.substring(0, splitNum), 2);
            char ch = (char) parseInt;
            str = str.substring(splitNum);
            System.out.print(ch);
        }
    }

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        String input2 = in.nextLine();
        new Practice13().execute(input1, input2);
    }
}
