package practice.programers;

import java.util.HashMap;
import java.util.Map;

/**
 * 달리기 경주
 * */
public class Solution002 {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();

        // 순서 담기
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String callPlayer : callings) {
            int callPlayerIndex = map.get(callPlayer);
            String frontPlayer = players[callPlayerIndex - 1];

            map.put(callPlayer, callPlayerIndex - 1);
            map.put(frontPlayer, callPlayerIndex);

            players[callPlayerIndex - 1] = callPlayer;
            players[callPlayerIndex] = frontPlayer;
        }

        return players;
    }

    public static void main(String[] args) {

    }
}

