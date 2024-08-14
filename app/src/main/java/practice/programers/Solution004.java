package practice.programers;

/**
 * 공원 산책
 * */
public class Solution004 {
    public int[] solution(String[] park, String[] routes) {
        int h = park.length;
        int w = park[0].length();

        int[] pointer = new int[2];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (park[i].charAt(j) == 'S') {
                    pointer[0] = i;
                    pointer[1] = j;
                    break;
                }
            }
        }

        int[][] directions = {
                {-1, 0}, {1, 0}, {0, -1}, {0, 1}
        };

        for (String route: routes) {
            char dir = route.charAt(0);
            int distance = Integer.parseInt(route.substring(2));
            int[] move = new int[2];

            switch (dir) {
                case 'N': move = directions[0]; break;
                case 'S': move = directions[1]; break;
                case 'W': move = directions[2]; break;
                case 'E': move = directions[3]; break;
            }

            boolean canMove = true;
            int newRow = pointer[0];
            int newCol = pointer[1];

            for (int i = 0; i < distance; i++) {
                newRow += move[0];
                newCol += move[1];

                if (newRow < 0 || newRow >= h || newCol < 0 || newCol >= w || park[newRow].charAt(newCol) == 'X') {
                    canMove = false;
                    break;
                }
            }

            if (canMove) {
                pointer[0] = newRow;
                pointer[1] = newCol;
            }
        }

        return pointer;
    }

    public static void main(String[] args) {
        new Solution004().solution(new String[]{"OSO", "OOO", "OXO", "OOO"}, new String[]{"E 2", "S 3", "W 1"});
    }
}

