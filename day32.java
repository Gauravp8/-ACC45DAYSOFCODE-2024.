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
            int N = sc.nextInt(); // Number of friends
            int[] recommendations = new int[11]; // Array to store recommendations (1 to 10)
            
            // Read recommendations and update counts
            for (int i = 0; i < N; i++) {
                int laptop = sc.nextInt();
                recommendations[laptop]++;
            }
            
            int maxCount = 0;
            int bestLaptop = -1;
            boolean isConfused = false;
            
            // Determine the laptop with the maximum count
            for (int i = 1; i <= 10; i++) {
                if (recommendations[i] > maxCount) {
                    maxCount = recommendations[i];
                    bestLaptop = i;
                    isConfused = false;
                } else if (recommendations[i] == maxCount) {
                    isConfused = true;
                }
            }
            
            // Output the result
            if (isConfused) {
                System.out.println("CONFUSED");
            } else {
                System.out.println(bestLaptop);
            }
        }
        
        sc.close();

	}
}
