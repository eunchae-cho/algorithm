package practice.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice15 {
    public static void main(String[] args) {
      int i = 123512;
      int tmp  = 0;
      while(i > 10) {
          if (i != 0 && i > 10) {
              tmp = i % 10;
              System.out.println(tmp);
          }
          i /= 10;
      }
    //   System.out.println(i);
    }
}
