package practice.programers;

import java.util.*;

/**
 * 달리기 경주
 * */
public class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        Map<String, Object> map = new HashMap<>();

        // 순서 담기
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {

        }

        return answer;
    }

    public static void main(String[] args) {

    }
}

