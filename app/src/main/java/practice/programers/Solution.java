package practice.programers;

import java.sql.Array;
import java.util.*;

/**
 * 공원 산책
 * */
public class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] pointer = new int[]{0, 0};
        int xLength = 0;
        int yLength = park.length;

        char[][] parkArr = new char[park.length][park.length];

        for (int i = 0; i < park.length; i++) {
            char[] charArr = park[i].toCharArray();
            xLength = charArr.length;
            for (int j = 0; j < charArr.length; j++) {
                parkArr[i][j] = charArr[j];

                if (charArr[j] == 'S') {
                    pointer[0] = i;
                    pointer[1] = j;
                }
            }
        }

         for (String route: routes) {
            String[] routeArr = route.split(" ");
            int distant = Integer.valueOf(routeArr[1]);
            int[] tmp = pointer.clone();
            boolean isChecked = true;

            int cnt = Integer.valueOf(routeArr[1]);
            switch (routeArr[0]) {
                case "N": {
                    while (cnt-- > 0) {
                        if (parkArr[tmp[0] - 1][tmp[1]] != 'O' || tmp[0] < 0) {
                            isChecked = false;
                            break;
                        }
                    }
                    if (isChecked) {
                        tmp[0] -= distant;
                    }
                    break;
                }
                case "S": {
                    while (cnt-- > 0) {
                        if (parkArr[tmp[0] + 1][tmp[1]] != 'O' || tmp[0] > yLength - 1) {
                            isChecked = false;
                            break;
                        }
                    }
                    if (isChecked) {
                        tmp[0] += distant;
                    }
                    break;
                }
                case "W": {
                    while (cnt-- > 0) {
                        if (parkArr[tmp[0]][tmp[1] - 1] != 'O' || tmp[1] < 0) {
                            isChecked = false;
                            break;
                        }
                    }
                    if (isChecked) {
                        tmp[1] -= distant;
                    }
                    break;
                }
                case "E": {
                    while (cnt-- > 0) {
                        if (parkArr[tmp[0]][tmp[1] + 1] != 'O' || tmp[1] > xLength - 1) {
                            isChecked = false;
                            break;
                        }
                    }
                    if (isChecked) {
                        tmp[1] += distant;
                    }
                    break;
                }
                default: break;
            }

        }
        return pointer;
    }

    public static void main(String[] args) {
        new Solution().solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});
    }
}

