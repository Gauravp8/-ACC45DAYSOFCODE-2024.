import java.util.Scanner;

public class DiscusThrow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt(); // Distance of first throw
            int B = scanner.nextInt(); // Distance of second throw
            int C = scanner.nextInt(); // Distance of third throw
            
            // Calculate the maximum distance among the three throws
            int finalScore = Math.max(A, Math.max(B, C));
            
            // Print the final score for this test case
            System.out.println(finalScore);
        }
        
        scanner.close();
    }
}
