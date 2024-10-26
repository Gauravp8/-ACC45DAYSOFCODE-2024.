import java.util.Scanner;

public class ChefCandyDistribution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Number of children
            int X = scanner.nextInt(); // Candies Chef already has

            // Calculate remaining candies needed
            int neededCandies = N - X;

            // Calculate the required packets
            int packets = (neededCandies > 0) ? (neededCandies + 3) / 4 : 0;

            // Output the result for the current test case
            System.out.println(packets);
        }

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class ChefTravelTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt(); // Time taken by BIKE
            int Y = scanner.nextInt(); // Time taken by CAR

            // Compare the times and determine the faster mode or if they're the same
            if (X < Y) {
                System.out.println("BIKE");
            } else if (Y < X) {
                System.out.println("CAR");
            } else {
                System.out.println("SAME");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
