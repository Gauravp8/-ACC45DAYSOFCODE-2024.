import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        
        StringBuilder output = new StringBuilder();
        
        for (int t = 0; t < T; t++) {
            // Read the number of distances and step length
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            
            // StringBuilder to build the result for this test case
            StringBuilder result = new StringBuilder();
            
            // Process each distance
            for (int i = 0; i < N; i++) {
                int D = scanner.nextInt();
                if (D % K == 0) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            
            // Add the result for the current test case to the final output
            output.append(result).append("\n");
        }
        
        // Output all results at once
        System.out.print(output.toString());
        
        scanner.close();

	}
}
