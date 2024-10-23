import java.util.Scanner;

public class TennisGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the number of test cases
        int T = scanner.nextInt();

        // Step 2: Process each test case
        for (int i = 0; i < T; i++) {
            // Read the decisions of the 4 referees
            int R1 = scanner.nextInt();
            int R2 = scanner.nextInt();
            int R3 = scanner.nextInt();
            int R4 = scanner.nextInt();

            // Step 3: Check if all referees consider the ball inside (i.e., all are 0)
            if (R1 == 0 && R2 == 0 && R3 == 0 && R4 == 0) {
                System.out.println("IN");
            } else {
                System.out.println("OUT");
            }
        }

        // Closing the scanner
        scanner.close();
    }
}
