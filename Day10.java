//Q1.
import java.util.Scanner;
import java.util.HashMap;

public class Day10 {
    public static void ExpertCheck () {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt(); // Number of problems submitted
            int Y = sc.nextInt(); // Number of problems approved
            
            // Check if Munchy is an expert
            if (2 * Y >= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        
    }

//Q2.
    public static void CardGame () {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int T = sc.nextInt();
        
        // Loop through each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();  // Number of cards
            int[] A = new int[N];  // Array to store the numbers on the cards
            
            // Read the numbers on the cards
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
            }
            
            // Count frequency of each number
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
            for (int num : A) {
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
            
            // Find the maximum frequency
            int maxFrequency = 0;
            for (int freq : frequencyMap.values()) {
                if (freq > maxFrequency) {
                    maxFrequency = freq;
                }
            }
            
            // Calculate the minimum number of moves
            int minMoves = N - maxFrequency;
            
            // Output the result for this test case
            System.out.println(minMoves);
        }
        
        
    }

    public static void main(String[] args){

        System.out.println("Expert Check:");
        ExpertCheck();

        System.out.println("Card Game: ");
        CardGame();

    }

}
