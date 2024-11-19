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
            // Read the length of the array
            int N = sc.nextInt();
            
            // Read the array elements
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            int maxFrequency = 0;
            
            // Count frequencies of elements in the array
            for (int i = 0; i < N; i++) {
                int element = sc.nextInt();
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
                maxFrequency = Math.max(maxFrequency, frequencyMap.get(element));
            }
            
            // The minimum number of operations is N - maxFrequency
            int minOperations = N - maxFrequency;
            System.out.println(minOperations);
        }
        
        sc.close();

	}
}
