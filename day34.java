import java.util.Scanner;

public class ChefScoreAchievability {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        
        for (int i = 0; i < T; i++) {
            int N = scanner.nextInt(); // Number of problems
            int X = scanner.nextInt(); // Marks per problem
            int Y = scanner.nextInt(); // Target score
            
            // Check the two conditions
            if (Y % X == 0 && Y / X <= N) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}
