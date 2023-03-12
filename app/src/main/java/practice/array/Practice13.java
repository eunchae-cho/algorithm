package practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice13 {
    public static void main(String[] args) {
        int a = 10;
        double sqrt = Math.sqrt(a);

        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        
        for (int i = 1; i <= sqrt; i++) {
           if (a % i == 0) {
               list.add(i);
               if (a / i != i) {
                   list.add(a / i);
               }
           }
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
