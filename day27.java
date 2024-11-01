import java.util.Scanner;

public class TemperatureAgreement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int T = scanner.nextInt();

        while (T-- > 0) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            // Calculate the minimum acceptable temperature for Alice and Charlie
            int minAcceptableTemperature = Math.max(A, C);

            // Check if Bob's upper limit allows this temperature
            if (minAcceptableTemperature <= B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class BusExit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int X = scanner.nextInt();

            // Calculate distance to each exit
            int distanceToLeftExit = X - 1;
            int distanceToRightExit = 100 - X;

            // Determine which exit is closer or equally close
            if (distanceToLeftExit <= distanceToRightExit) {
                System.out.println("LEFT");
            } else {
                System.out.println("RIGHT");
            }
        }
        
        scanner.close();
    }
}
