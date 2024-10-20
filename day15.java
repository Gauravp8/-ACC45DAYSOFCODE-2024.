import java.util.Scanner;

public class WaterFillingTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            // Read B1, B2, and B3
            int B1 = scanner.nextInt();
            int B2 = scanner.nextInt();
            int B3 = scanner.nextInt();

            // Step 3: Calculate the number of full bottles
            int sum = B1 + B2 + B3;

            // Step 4: Output the result based on the sum
            if (sum <= 1) {
                System.out.println("Water filling time");
            } else {
                System.out.println("Not now");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class ShoppingDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            // Read the shopping amount X
            int X = scanner.nextInt();

            // Step 3: Calculate the final amount based on the discount
            int finalAmount;
            if (X <= 100) {
                finalAmount = X;  // No discount
            } else if (X <= 1000) {
                finalAmount = X - 25;  // Discount of 25 rupees
            } else if (X <= 5000) {
                finalAmount = X - 100;  // Discount of 100 rupees
            } else {
                finalAmount = X - 500;  // Discount of 500 rupees
            }

            // Step 4: Print the final amount
            System.out.println(finalAmount);
        }

        // Closing the scanner
        scanner.close();
    }
}
