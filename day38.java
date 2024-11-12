import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // Number of test cases
        StringBuilder result = new StringBuilder();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Size of the chessboard (N x N)
            int X = sc.nextInt(); // Row position of the Queen
            int Y = sc.nextInt(); // Column position of the Queen

            // Calculate cells under attack in each direction

            // Horizontal and Vertical Moves
            int horizontal = (N - 1); // All cells in the same row except Queen's cell
            int vertical = (N - 1);   // All cells in the same column except Queen's cell

            // Diagonal Moves
            int topLeftDiagonal = Math.min(X - 1, Y - 1);
            int topRightDiagonal = Math.min(X - 1, N - Y);
            int bottomLeftDiagonal = Math.min(N - X, Y - 1);
            int bottomRightDiagonal = Math.min(N - X, N - Y);

            // Total cells under attack by the Queen
            int totalCellsUnderAttack = horizontal + vertical + 
                                        topLeftDiagonal + topRightDiagonal + 
                                        bottomLeftDiagonal + bottomRightDiagonal;
                                        
            result.append(totalCellsUnderAttack).append("\n");
        }
        
        System.out.print(result);
        sc.close();

	}
}
