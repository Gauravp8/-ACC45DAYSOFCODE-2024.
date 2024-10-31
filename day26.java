import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        StringBuilder output = new StringBuilder();
        
        while (T-- > 0) {
            int N = sc.nextInt();  // Size of the array
            int[] A = new int[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Rearranging the array to meet the conditions
            for (int i = 0; i < N - 1; i++) {
                if (i % 2 == 0) {
                    // Even index: A[i] <= A[i+1]
                    if (A[i] > A[i + 1]) {
                        swap(A, i, i + 1);
                    }
                } else {
                    // Odd index: A[i] >= A[i+1]
                    if (A[i] < A[i + 1]) {
                        swap(A, i, i + 1);
                    }
                }
            }
            
            // Appending the result to output
            for (int i = 0; i < N; i++) {
                output.append(A[i]).append(" ");
            }
            output.append("\n");
        }
        
        System.out.print(output);
        sc.close();
    }
    
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
	}
}
