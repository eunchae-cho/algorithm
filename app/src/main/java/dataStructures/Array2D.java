package dataStructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Array2D {
    private static void hourGlass(List<List<Integer>> arr) {
        int R = 6;
        int C = 6;
        int max = Integer.MIN_VALUE, sum;
        
        for (int i = 0; i <= R - 3; i++) {
            for (int j = 0; j <= C - 3; j++) {
                sum = (arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2))
                + arr.get(i + 1).get(j + 1) +
                + (arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2));
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
                
                
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        
        hourGlass(arr);

        bufferedReader.close();
    }
}