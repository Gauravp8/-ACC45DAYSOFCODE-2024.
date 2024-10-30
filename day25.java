import java.util.Scanner;

public class ChefToDoList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int T = scanner.nextInt();
        
        // Process each test case
        while (T-- > 0) {
            // Read number of problems
            int N = scanner.nextInt();
            int removeCount = 0;
            
            // Read difficulty ratings and count those >= 1000
            for (int i = 0; i < N; i++) {
                int difficulty = scanner.nextInt();
                if (difficulty >= 1000) {
                    removeCount++;
                }
            }
            
            // Output the number of problems to remove
            System.out.println(removeCount);
        }
        
        scanner.close();
    }
}
