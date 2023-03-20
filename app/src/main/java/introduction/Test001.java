package introduction;

public class Test001 {
    public static void main(String[] args) {
        int i = 10, j = 50, k = 5;
        int answer = 0, tmp = i;

        while (i != j + 1) {
            if (tmp % 10 == k) {
                answer++;
            }

            tmp /= 10;

            if (tmp == 0) {
                tmp = ++i;
            }

        }

        System.out.println(answer);

    }
}
