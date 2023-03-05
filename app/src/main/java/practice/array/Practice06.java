package practice.array;

public class Practice06 {
    public static void main(String[] args) {
        Solution06 s = new Solution06();
        System.out.println(s.solution(10));
    }
}

class Solution06 {
    public int solution(int n) {
        int piece = 6, people = n;

        while (piece != people) {
            System.out.println("piece : " + piece + " people : " + people);
            if (people > piece) {
                piece += 6;
            }
            if (piece > people) {
                people += n;
            }
        }
    
        return piece / 6;
    }
}