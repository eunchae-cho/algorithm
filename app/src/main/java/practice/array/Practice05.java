package practice.array;

import java.util.HashMap;
import java.util.Map;

public class Practice05 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{0,1,2,3,4}));
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
            answer = Math.max(answer, map.get(array[i]));
        }
        
        int cnt = 0;
        
        for (int key : map.keySet()) {
            if (map.get(key) == answer) {
                cnt++;
            }
        }
        System.out.println("cnt : "+cnt);

        if (cnt >  1) {
            return -1;
        }
        
        return answer;
    }
}