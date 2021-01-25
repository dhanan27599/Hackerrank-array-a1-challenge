import java.util.Scanner;

public class ClimbingtheLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        int[] rank = new int[n];
        scores[0] = in.nextInt();
        rank[0] = 1;
        int count = 1;
        for (int scores_i = 1; scores_i < n; scores_i++) {
            scores[scores_i] = in.nextInt();
            if (scores[scores_i - 1] != scores[scores_i]) {
                count++;
            }
            rank[scores_i] = count;
        }

        int m = in.nextInt();
        Long aliceScore = 0L;
        int aliceRank = count + 1;
        int index = n - 1;
        for (int alice_i = 0; alice_i < m; alice_i++) {
            aliceScore = in.nextLong();
            while (index >= 0 && aliceScore >= scores[index]) {
                aliceRank = rank[index];
                index--;
            }

            if (index < 0)
                aliceRank = 1;
            System.out.println(aliceRank);
        }

    }
}