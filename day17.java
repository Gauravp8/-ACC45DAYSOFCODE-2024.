import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        // Read number of test cases
        int T = sc.nextInt();
        
        // Loop through all the test cases
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt(); // Amount offered by first investor
            int B = sc.nextInt(); // Amount offered by second investor
            
            // Calculate the valuations
            int V1 = 10 * A; // First investor's company valuation
            int V2 = 5 * B;  // Second investor's company valuation
            
            // Compare the valuations and print the appropriate result
            if (V1 > V2) {
                System.out.println("FIRST");
            } else if (V2 > V1) {
                System.out.println("SECOND");
            } else {
                System.out.println("ANY");
            }
        }
        

	}
}
