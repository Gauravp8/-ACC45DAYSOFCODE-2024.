import java.util.Scanner;

public class JengaGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int T = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Number of players
            int X = scanner.nextInt(); // Number of tiles
            
            // Check if tiles are evenly divisible by number of players
            if (X % N == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        // Close the scanner
        scanner.close();
    }
}
