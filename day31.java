import java.util.Scanner;

public class MemoryCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Memory in bits for each test case
            int N = scanner.nextInt();
            
            // Check if memory is a multiple of 4 (Good) or not (Not Good)
            if (N % 4 == 0) {
                System.out.println("Good");
            } else {
                System.out.println("Not Good");
            }
        }
        
        scanner.close();
    }
}
