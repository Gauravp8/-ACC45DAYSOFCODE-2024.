import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Number of states
            int X = sc.nextInt(); // Number of extra votes Chef can cast

            int[] A = new int[N]; // Votes for candidate A in each state
            int[] B = new int[N]; // Votes for candidate B in each state
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            for (int i = 0; i < N; i++) {
                B[i] = sc.nextInt();
            }

            int statesAWinning = 0;
            PriorityQueue<Integer> voteDiffs = new PriorityQueue<>(); // To store votes needed for A to win in losing states

            for (int i = 0; i < N; i++) {
                if (A[i] > B[i]) {
                    statesAWinning++; // Count states A is already winning
                } else {
                    int neededVotes = B[i] - A[i] + 1; // Minimum votes to turn this state in A's favor
                    voteDiffs.add(neededVotes);
                }
            }

            int requiredWins = (N / 2) + 1; // States A needs to win to secure the election
            while (statesAWinning < requiredWins && !voteDiffs.isEmpty() && X > 0) {
                int neededVotes = voteDiffs.poll();
                if (neededVotes <= X) {
                    X -= neededVotes;
                    statesAWinning++;
                } else {
                    break;
                }
            }

            if (statesAWinning >= requiredWins) {
                result.append("YES\n");
            } else {
                result.append("NO\n");
            }
        }
        
        System.out.print(result);
        sc.close();

	}
}
