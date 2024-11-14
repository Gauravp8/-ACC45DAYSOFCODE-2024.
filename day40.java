import java.util.Scanner;

public class MaximumTastinessDish {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int a = scanner.nextInt(); // Tastiness of ingredient A
            int b = scanner.nextInt(); // Tastiness of ingredient B
            int c = scanner.nextInt(); // Tastiness of ingredient C
            int d = scanner.nextInt(); // Tastiness of ingredient D
            
            // Calculate all possible combinations of tastiness
            int option1 = a + c;
            int option2 = a + d;
            int option3 = b + c;
            int option4 = b + d;
            
            // Find the maximum tastiness
            int maxTastiness = Math.max(Math.max(option1, option2), Math.max(option3, option4));
            
            // Output the result for this test case
            System.out.println(maxTastiness);
        }
        
        scanner.close();
    }
}
