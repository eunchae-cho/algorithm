package introduction;

public class Test001 {
    public static void main(String[] args) {
        int answer = 1, k = 1, n = 3628800;

        while (answer <= n) {
            answer *= k;

            // System.out.println(answer + " *= " + k);

            if (answer > n) {
                k -= 1;
                break;
            } else {
                k++;
            }
        }

        System.out.println(110 / 10);

    }
}
