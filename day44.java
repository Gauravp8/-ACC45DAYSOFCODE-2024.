import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        
        // Number of test cases
        int T = sc.nextInt();
        
        // Iterate over each test case
        for (int t = 0; t < T; t++) {
            // Read A, B, C, D, E for each test case
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            int D = sc.nextInt();
            int E = sc.nextInt();
            
            // Check all three possible cases:
            // Case 1: Carry A, check-in B and C
            boolean valid = (A <= E && (B + C) <= D) ||
                            // Case 2: Carry B, check-in A and C
                            (B <= E && (A + C) <= D) ||
                            // Case 3: Carry C, check-in A and B
                            (C <= E && (A + B) <= D);
            
            // Output the result based on the validity of the cases
            if (valid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();

	}
}
