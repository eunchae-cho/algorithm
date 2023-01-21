package practice.array;

import java.util.Scanner;

public class Practice10 {

    private int[] calculate(String s, char t) {

        char[] charArr = s.toCharArray();

        int[] intArr = new int[charArr.length];

        int firstDistance = 0;

        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] == t) {
                firstDistance = 0;
            } else {
                intArr[i] = ++firstDistance;
            }
        }

        int secondDistance = 0;

        for (int i = charArr.length - 1; i >= 0; i--) {
            if (charArr[i] == t) {
                secondDistance = 0;
            } else {
                if (intArr[i] > ++secondDistance) {
                    intArr[i] = (char) secondDistance;
                }
            }
        }

        return intArr;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String t = in.next();
        char s = in.next().charAt(0);

        Practice10 m = new Practice10();

        for (int i : m.calculate(t, s)) {
            System.out.print(i);
        }

    }
}