import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int[][] A = new int[N][N];
            
            // Read the matrix A
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = scanner.nextInt();
                }
            }
            
            int maxTrace = 0;
            
            // Check all diagonals starting from each row in the first column
            for (int i = 0; i < N; i++) {
                int trace = 0;
                for (int k = 0; k < N - i; k++) {
                    trace += A[i + k][k];
                    maxTrace = Math.max(maxTrace, trace);
                }
            }
            
            // Check all diagonals starting from each column in the first row
            for (int j = 1; j < N; j++) {
                int trace = 0;
                for (int k = 0; k < N - j; k++) {
                    trace += A[k][j + k];
                    maxTrace = Math.max(maxTrace, trace);
                }
            }
            
            // Output the maximum trace for this test case
            System.out.println(maxTrace);
        }
        
        scanner.close();

	}
}
