package introduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test003 {

    private static int timeToInt(String str) {
        return Integer.parseInt(str.replace(":", ""));
    }

    private static int timePlusTen(String str) {
        int time = Integer.parseInt(str.replace(":", "")) + 10;
        if (time % 100 >= 60) {
            time = (time / 100 + 1) * 100 + (time % 100 - 60);
        }
        return time;
    }

    public static void main(String[] args) {
        String[][] str = { { "15:00", "17:00" }, { "15:00", "17:00" }, { "15:00", "17:00" } };
        // String[][] str = { { "15:00", "17:00" }, { "16:40", "18:20" }, { "14:20",
        // "15:20" }, { "14:10", "19:20" },
        // { "18:20", "21:20" }, { "12:00", "17:00" } };
        Arrays.sort(str, new Comparator<String[]>() {
            @Override
            public int compare(String[] a, String[] b) {
                if (timeToInt(a[1]) == timeToInt(b[1])) {
                    return timeToInt(a[0]) - timeToInt(b[0]);
                }
                return timeToInt(a[1]) - timeToInt(b[1]);
            }
        });

        System.out.println(Arrays.deepToString(str));

        Queue<Integer> q = new LinkedList<>();
        q.offer(timePlusTen(str[0][1]));

        for (int i = 1; i < str.length; i++) {
            int nextTime = timeToInt(str[i][0]);
            int reservedTime = q.peek();
            if (reservedTime < nextTime) {
                q.poll();
            }
            q.offer(timePlusTen(str[i][1]));
        }

        System.out.println(q.size());
    }
}
