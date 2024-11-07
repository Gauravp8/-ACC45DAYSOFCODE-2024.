import java.util.Scanner;

public class EligibleVotersCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            // Read N (number of people) and X (minimum voting age)
            int N = scanner.nextInt();
            int X = scanner.nextInt();
            
            int eligibleCount = 0; // Initialize count of eligible voters
            
            // Read the ages of N people and count eligible voters
            for (int i = 0; i < N; i++) {
                int age = scanner.nextInt();
                if (age >= X) {
                    eligibleCount++;
                }
            }
            
            // Output the number of eligible voters for this test case
            System.out.println(eligibleCount);
        }
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
