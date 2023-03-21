package introduction;

public class Test002 {
    int[] x = { -1, 0, 1, 0 };
    int[] y = { 0, 1, 0, -1 };
    int answer = Integer.MAX_VALUE;
    int cnt = 0;
    int[] po = { 0, 0 };

    private void dfs(String[] board, int i) {
        // for (int i = 0; i < 4; i++) {
        po[0] += y[i];
        po[1] += x[i];

        System.out.println(po[0] + ", " + po[1]);

        if (0 <= po[0] && po[0] < board.length
                && 0 <= po[1] && po[1] < board[0].length()) {
            System.out.println(board[po[0]].charAt(po[1]));

            if (board[po[0]].charAt(po[1]) == 'G') {
                return;
            } else if (board[po[0]].charAt(po[1]) == '.') {
                System.out.println("weiter!");
                dfs(board, i);
            } else {
                po[0] -= y[i];
                po[1] -= x[i];
            }

            // while (board[po[0]].charAt(po[1]) != 'D') {
            // System.out.println("weiter!");
            // dfs(board, i);
            // }
            cnt++;
        }

        // }
    }

    public int solution(String[] board) {

        // R 위치 셋팅
        for (int i = 0; i < board.length; i++) {
            if (board[i].indexOf("R") != -1) {
                po[0] = i;
                po[1] = board[i].indexOf("R");
            }
        }

        for (int i = 0; i < 4; i++) {
            dfs(board, i);
            System.out.println("cnt : " + cnt);
            answer = Math.min(answer, cnt);
            cnt = 0;
        }

        return answer;

    }

    public static void main(String[] args) {
        String[] board = { "...D..R", ".D.G...", "....D.D", "D....D.", "..D...." };

        System.out.println(new Test002().solution(board));

    }
}
