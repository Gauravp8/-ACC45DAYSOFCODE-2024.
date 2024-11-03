import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            // Read the integer N
            int N = scanner.nextInt();
            
            // Convert N to a StringBuilder to reverse it
            StringBuilder reversedString = new StringBuilder(String.valueOf(N)).reverse();
            
            // Parse the reversed string back to an integer to remove leading zeros
            int reversedNumber = Integer.parseInt(reversedString.toString());
            
            // Print the result
            System.out.println(reversedNumber);
        }
        
        scanner.close();
    }
}
