import java.util.Scanner;

public class day13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();  // Hours worked from Monday to Thursday
            int Y = sc.nextInt();  // Hours worked on Friday
            
            // Calculate total working hours in a week
            int totalHours = (4 * X) + Y;
            
            // Output the result for this test case
            System.out.println(totalHours);
        }
        
        sc.close();
    }
}
