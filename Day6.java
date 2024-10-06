import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            
            int result = (Y / X) - 1;
            
            if (result < 0) {
                result = 0;
            }
            
            System.out.println(result);
        }
        
    }
}
