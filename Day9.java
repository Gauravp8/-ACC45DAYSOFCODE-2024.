//Q1. Flip The Cards
import java.util.*;
import java.lang.*;
import java.io.*;

public class Day9
{
	public static void FlipCards() 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        // Input number of test cases
        int T = sc.nextInt();
        
        // Loop for each test case
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt(); // Total cards
            int X = sc.nextInt(); // Cards facing up
            
            // Calculate the minimum number of flips
            int flipsToFaceUp = N - X; // Flip all face-down cards
            int flipsToFaceDown = X;   // Flip all face-up cards
            
            // Output the minimum of the two options
            System.out.println(Math.min(flipsToFaceUp, flipsToFaceDown));
        }
        

    }

    //Q2. Tanu and Head Bob 

    public static void HeadBob () 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        // Input the number of people observed
        int T = sc.nextInt();
        
        // Loop through each person
        for (int t = 0; t < T; t++) {
            // Input the number of gestures for the current person
            int N = sc.nextInt();
            String gestures = sc.next();
            
            // Flag to track if we found an "I" or a "Y"
            boolean isIndian = false;
            boolean isNotIndian = false;
            
            // Process the gestures
            for (int i = 0; i < N; i++) {
                char gesture = gestures.charAt(i);
                if (gesture == 'I') {
                    isIndian = true;
                    break;  // No need to check further if Indian is found
                } else if (gesture == 'Y') {
                    isNotIndian = true;
                }
            }
            
            // Output the result based on the flags
            if (isIndian) {
                System.out.println("INDIAN");
            } else if (isNotIndian) {
                System.out.println("NOT INDIAN");
            } else {
                System.out.println("NOT SURE");
            }
        }

	}

    public static void main(String[] args){
        System.out.println("Flip the Card:");
        FlipCards();

        System.out.println("Head Bob:");
        HeadBob();
    }
}
