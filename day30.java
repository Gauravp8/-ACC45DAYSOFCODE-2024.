import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();  // Number of test cases
        
        StringBuilder result = new StringBuilder();
        while (T-- > 0) {
            int N = scanner.nextInt();  // Length of array A (and B)
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = scanner.nextInt();
            }
            
            // If N is odd, there is always a solution
            if (N % 2 == 1) {
                result.append("YES\n");
            } else {
                // Check if the count of 1s in B is even
                int onesCount = 0;
                for (int b : B) {
                    onesCount += b;
                }
                
                // If the number of 1s in B is even, it's possible to form array A
                result.append((onesCount % 2 == 0) ? "YES\n" : "NO\n");
            }
        }
        
        System.out.print(result);
        scanner.close();

	}
}
