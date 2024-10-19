import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int luckySoldiers = 0, unluckySoldiers = 0;

        for (int i = 0; i < N; i++) {
            int weapons = scanner.nextInt();

            if (weapons % 2 == 0) {
                luckySoldiers++;  
            } else {
                unluckySoldiers++; 
            }
        }

        if (luckySoldiers > unluckySoldiers) {
            System.out.println("READY FOR BATTLE");
        } else {
            System.out.println("NOT READY");
        }

    }
}

import java.util.Scanner;

public class CredBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Read number of test cases
        int T = scanner.nextInt();

        // Step 2: Loop through each test case
        for (int i = 0; i < T; i++) {
            // Read X and Y
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            // Step 3: Calculate the total CRED coins earned
            int totalCoins = X * Y;

            // Step 4: Calculate the number of bags
            int bags = totalCoins / 100;

            // Step 5: Print the result for this test case
            System.out.println(bags);
        }

        // Closing the scanner
        scanner.close();
    }
}

