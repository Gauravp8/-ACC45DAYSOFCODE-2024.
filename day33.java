import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            long L = sc.nextLong(); // Length of the stick
            long K = sc.nextLong(); // Number of parts
            
            // Calculate small part length and remainder
            long smallPart = L / K;
            long remainder = L % K;
            
            // Calculate minimum sum of absolute differences
            long minSumDifference = remainder * (K - remainder);
            
            // Output the result
            System.out.println(minSumDifference);
        }
        
        sc.close();

	}
}
