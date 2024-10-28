import java.util.Scanner;

public class MonopolyChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        while (T-- > 0) {
            int P = scanner.nextInt();
            int Q = scanner.nextInt();
            int R = scanner.nextInt();
            int S = scanner.nextInt();
            
            // Check if any one company's profit is greater than the sum of others
            if (P > Q + R + S || Q > P + R + S || R > P + Q + S || S > P + Q + R) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
