import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();  // Number of test cases
        
        while (T-- > 0) {
            int n = sc.nextInt();  // Number of movies
            int[] L = new int[n];   // Array for movie lengths
            int[] R = new int[n];   // Array for movie ratings
            
            for (int i = 0; i < n; i++) {
                L[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                R[i] = sc.nextInt();
            }
            
            int bestIndex = 0;  // To store the best movie index
            int maxProduct = L[0] * R[0];  // Initial maximum product
            int maxRating = R[0];  // Initial maximum rating for tie-breaking
            
            for (int i = 1; i < n; i++) {
                int currentProduct = L[i] * R[i];
                
                // Check if we found a better movie
                if (currentProduct > maxProduct ||
                    (currentProduct == maxProduct && R[i] > maxRating) ||
                    (currentProduct == maxProduct && R[i] == maxRating && i < bestIndex)) {
                    bestIndex = i;
                    maxProduct = currentProduct;
                    maxRating = R[i];
                }
            }
            
            // Output the 1-based index of the chosen movie
            System.out.println(bestIndex + 1);
        }
        
        sc.close();
    

	}
}
