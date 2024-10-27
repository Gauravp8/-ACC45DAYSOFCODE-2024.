import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int t = 0; t < T; t++) {
            // Read the number of times Chef plucks a string
            int N = scanner.nextInt();
            
            // Array to store the string numbers Chef plucks
            int[] strings = new int[N];
            
            // Read each string position
            for (int i = 0; i < N; i++) {
                strings[i] = scanner.nextInt();
            }
            
            int totalSkips = 0;
            
            // Calculate the total skips between consecutive plucks
            for (int i = 1; i < N; i++) {
                totalSkips += Math.abs(strings[i] - strings[i - 1]) - 1;
            }
            
            // Print the result for this test case
            System.out.println(totalSkips);
        }
        
        scanner.close();

	}
}
