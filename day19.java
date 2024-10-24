import java.util.Scanner;

public class Helium3Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            // Read A, B, X, Y for each test case
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Step 3: Calculate the required power and available power
            int requiredPower = A * B;
            int availablePower = X * Y;

            // Step 4: Determine if the available power is enough to meet the required power
            if (availablePower >= requiredPower) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
