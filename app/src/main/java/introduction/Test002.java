package introduction;

public class Test002 {
    int[] x = { -1, 0, 1, 0 };
    int[] y = { 0, 1, 0, -1 };
    int answer = Integer.MAX_VALUE;
    int cnt = 0;
    int[] po = { 0, 0 };

    private void bfs(String[] board, int i) {
        // for (int i = 0; i < 4; i++) {
        po[0] += x[i];
        po[1] += y[i];

        if (0 <= po[0] && po[0] < board[0].length()
                && 0 <= po[1] && po[1] < board.length) {

            if (board[po[0]].charAt(po[1]) == 'G') {
                return;
            }

            while (board[po[0]].charAt(po[1]) != 'D') {
                bfs(board, i);
            }

        }
        cnt++;
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
            bfs(board, i);
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
