import java.util.Scanner;

public class BusSeatClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Seat number
            
            if (N >= 1 && N <= 10) {
                System.out.println("Lower Double");
            } else if (N >= 11 && N <= 15) {
                System.out.println("Lower Single");
            } else if (N >= 16 && N <= 25) {
                System.out.println("Upper Double");
            } else if (N >= 26 && N <= 30) {
                System.out.println("Upper Single");
            }
        }
        
        scanner.close();
    }
}
