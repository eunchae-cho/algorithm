package practice.programers;

import java.util.Arrays;
import java.util.List;

/**
 * 2024 kakao winter intership 가장 많이 받은 선물
 * */
public class Solution001 {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;

        List<String> friendsList = Arrays.asList(friends);

        // 주고 받은 선물 목록
        Integer[][] giftArr = new Integer[friends.length][friends.length];

        // 선물 목록 초기화
        Arrays.stream(giftArr).forEach(g -> Arrays.fill(g, 0));

        // 주고 받은 선물 목록 만들기
        for (int i = 0; i < gifts.length; i++) {
            String[] fromToArr = gifts[i].split(" ");
            giftArr[friendsList.indexOf(fromToArr[0])][friendsList.indexOf(fromToArr[1])] += 1;
        }
        System.out.println(Arrays.deepToString(giftArr));

        // 선물 지수 목록 만들기
        Integer[][] giftScoreArr = new Integer[friends.length][3];

        // 준 선물 계산
        for (int i = 0; i < giftArr.length; i++) {
            int total = 0;
            for (int j = 0; j < giftArr[i].length; j++) {
                total += giftArr[i][j];
            }
            giftScoreArr[i][0] = total;
        }

        // 받은 선물 계산
        for (int i = 0; i < giftArr.length; i++) {
            int total = 0;
            for (int j = 0; j < giftArr[i].length; j++) {
                total += giftArr[j][i];
            }
            giftScoreArr[i][1] = total;
        }

        // 선물 지수 계산
        for (int i = 0; i < giftScoreArr.length; i++) {
            giftScoreArr[i][2] = giftScoreArr[i][0] - giftScoreArr[i][1];
        }
        System.out.println(Arrays.deepToString(giftScoreArr));

        // 다음 달 선물 수 배열
        int[] answerArr = new int[friends.length];

        // 다음 달 선물 수 구하기
        for (int i = 0; i < giftArr.length; i++) {
            // 초기화
            answerArr[i] = 0;
            for (int j = 0; j < giftArr.length; j++) {
                if (i == j) continue;

                if ((giftArr[i][j] > 0 || giftArr[j][i] > 0) && giftArr[i][j] != giftArr[j][i]) {
                    if (giftArr[i][j] > giftArr[j][i]) {
                        answerArr[i]++;
                    } else {
                        answerArr[j]++;
                    }
                }

                if ((giftArr[i][j] == 0 &&  giftArr[j][i] == 0) || giftArr[i][j] == giftArr[j][i]) {
                    if (i < j) {
                        System.out.println("i = " + i + ", j = " + j);
                        if (giftScoreArr[i][2] < giftScoreArr[j][2]) {
                            answerArr[i]++;
                        } else if (giftScoreArr[i][2] > giftScoreArr[j][2]) {
                            answerArr[j]++;
                        }
                    }

                }
            }
        }

        answer = Arrays.stream(answerArr).max().getAsInt();
        return answer;
    }

    public static void main(String[] args) {
//        new Solution001().solution(
//                new String[]{"muzi", "ryan", "frodo", "neo"},
//        new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}
//        );

        new Solution001().solution(
                new String[]{"a", "b", "c"},
                new String[]{"b a"}
        );
    }
}

