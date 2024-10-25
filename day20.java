import java.util.Scanner;

public class JuicerProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Number of glasses sold
            int profit = 15 * N; // Calculate profit as 15 * N
            System.out.println(profit);
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class NotebookFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Weight of pulp in kg
            int notebooks = 10 * N; // Calculate notebooks as 10 * N
            System.out.println(notebooks);
        }

        // Close the scanner
        scanner.close();
    }
}
