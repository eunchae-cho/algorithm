package dataStructures;

import java.util.List;
import java.util.Scanner;

public class ListInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        int queries = sc.nextInt();
        
        while(queries-- > 0) {
            String str = sc.next();
            switch(str) {
                case "Insert" : 
                    int index = sc.nextInt();
                    int num = sc.nextInt();
                    list.add(index, num);
                    break;
                case "Delete" :
                    int index2 = sc.nextInt();
                    list.remove(index2);
                    break;
                default: 
                break;        
            }
        }
        
       for (int i : list) {
           System.out.printf("%d ", i);
       }
       
        sc.close();
    }
}
