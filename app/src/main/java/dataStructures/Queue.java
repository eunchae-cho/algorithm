package dataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String a = sc.nextLine();
        String b = sc.nextLine();

        Queue<Character> q = new LinkedList<>();

        for (char ch : a.toCharArray()) {
            q.offer(ch);
        }

        int cnt = 0;
        while(cnt++ < q.size()) {
            for (int i = 0; i < b.length(); i++){
                if (b.charAt(i) == q.get(i)) {
                    q.poll();
                }
            }
        }

        System.out.println(q.isEmpty() ? "YES" : "NO");
        

        sc.close();
      }
}
