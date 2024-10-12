import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of test cases
        int T = sc.nextInt();
        
        // Process each test case
        for (int t = 0; t < T; t++) {
            int X = sc.nextInt();  // Number of schools
            int Y = sc.nextInt();  // Students per school
            int Z = sc.nextInt();  // Passed students
            
            // Calculate total students
            int totalStudents = X * Y;
            
            // Check if passed students are more than 50% of total students
            if (Z > totalStudents / 2) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
