import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        sc.nextLine(); // Consume the newline
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Length of the string
            sc.nextLine(); // Consume the newline after integer input
            String S = sc.nextLine(); // The message string
            
            // Step 1: Swap adjacent characters
            char[] arr = S.toCharArray();
            for (int i = 0; i < N - 1; i += 2) {
                char temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
            
            // Step 2: Character mapping
            for (int i = 0; i < N; i++) {
                arr[i] = (char) (219 - arr[i]); // Convert using the formula 219 - ord(c)
            }
            
            // Output the result as a string
            System.out.println(new String(arr));
        }
        
        sc.close();

	}
}
