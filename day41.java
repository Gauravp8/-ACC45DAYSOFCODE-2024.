import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        
        // Read the number of test cases
        int T = Integer.parseInt(br.readLine());
        
        while (T-- > 0) {
            // Read the number of swipes
            int N = Integer.parseInt(br.readLine());
            String[] swipes = br.readLine().split(" ");
            
            // To track the status of each ID
            Set<Integer> currentInOffice = new HashSet<>();
            int maxPeople = 0;

            // Process each swipe
            for (int i = 0; i < N; i++) {
                int id = Integer.parseInt(swipes[i]);
                if (currentInOffice.contains(id)) {
                    // If the ID is already in, they swipe out
                    currentInOffice.remove(id);
                } else {
                    // Otherwise, they swipe in
                    currentInOffice.add(id);
                }
                // Update the maximum count
                maxPeople = Math.max(maxPeople, currentInOffice.size());
            }

            // Add the result for the current test case
            result.append(maxPeople).append("\n");
        }
        
        // Print all results at once
        System.out.print(result);

	}
}
