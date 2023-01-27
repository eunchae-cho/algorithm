package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayList {
    public static void main(String[] args) {
        try {   
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine().trim());
        
            List<List<Integer>> list = (List<List<Integer>>) new ArrayList();
            
            for (int i = 0; i < n; i++) {
                list.add(
                    Arrays.asList(reader.readLine().split(" "))
                    .stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList())
                );
            }
            
            int d = Integer.parseInt(reader.readLine().trim());
            int cnt = 0;
            
            while (cnt++ < d) {
                List<Integer> qList = Arrays.asList(reader.readLine().split(" "))
                    .stream()
                    .map(s -> Integer.parseInt(s))
                    .collect(Collectors.toList());
                
                int q1 = qList.get(0) - 1;
                int q2 = qList.get(1);
                
                if (list.get(q1).size() <= q2) {
                    System.out.println("ERROR!");
                } else { 
                    System.out.println(list.get(q1).get(q2));
                }
            }
            
            reader.close();
        
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
