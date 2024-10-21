import java.util.Scanner;

public class day16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            // Read N (number of friends) and X (slices per friend)
            int N = scanner.nextInt();
            int X = scanner.nextInt();

            // Step 3: Calculate the total slices required
            int totalSlices = N * X;

            // Step 4: Calculate the minimum number of pizzas
            int pizzas = (totalSlices + 3) / 4;  // Adding 3 ensures rounding up

            // Step 5: Output the result
            System.out.println(pizzas);
        }

        // Closing the scanner
        scanner.close();
    }
}
