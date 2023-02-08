package practice.searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Point implements Comparable<Point> {
    int a;
    int b;

    Point(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int compareTo(Point point) {
        if (this.a == point.a) {
            return this.b - point.b;
        }

        return this.a - point.a;
    }
}

public class Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Point> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.add(new Point(a, b));
        }
        Collections.sort(list);

        for (Point p : list) {
            System.out.println(p.a + " " + p.b);
        }
    }
}
