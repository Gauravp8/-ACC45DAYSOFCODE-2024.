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
            // Read N (number of enemies) and X (damage in single-target mode)
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            // Read the health points of the enemies
            int[] health = new int[N];
            int maxHealth = 0;
            int singleTargetTime = 0;
            
            for (int i = 0; i < N; i++) {
                health[i] = sc.nextInt();
                maxHealth = Math.max(maxHealth, health[i]);
                // In single-target mode, it takes ceil(H_i / X) seconds to kill each enemy
                singleTargetTime += (int) Math.ceil(health[i] / (double) X);
            }
            
            // Multi-target mode: the time is the maximum health
            int multiTargetTime = maxHealth;
            
            // Minimum time to kill all enemies
            int minTime = Math.min(singleTargetTime, multiTargetTime);
            
            // Output the result for this test case
            System.out.println(minTime);
        }
        
        sc.close();

	}
}
