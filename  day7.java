/*Q1. Chef is playing with weights. He has an object weighing W units. He also has three weights each of X,Y and Z units respectively. Help him determine whether he can measure the exact weight of the object with one or more of these weights.
If it is possible to measure the weight of object with one or more of these weights, print YES, otherwise print NO.

 */
import java.util.Scanner;

public class Day7 {
    public static void Weights() {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int W = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            if (W == X || W == Y || W == Z || W == X + Y || W == X + Z || W == Y + Z || W == X + Y + Z) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        
    }

    /* Q2. A city has been infected by a contagious virus. In a survey, it was found that A out of the N people living in the city are currently infected. It has been observed that the only way for a person to get infected is if he comes in contact with an already infected person, and both of them are NOT wearing a mask.
The mayor of the city wants to make a new Mask Policy and find out the minimum number of people that will be required to wear a mask to avoid the further spread of the virus. Help the mayor in finding this number.
Note: The only aim of the mayor is to stop virus spread, not to mask every infected person.*/



    public static void VirusSpread() {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int A = sc.nextInt();
            
            int masksRequired = Math.min(A, N - A);
            
            System.out.println(masksRequired);
        }
        
        
    }

    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

        System.out.println("Weights:");
        Weights();

        System.out.println("Virus Spread:");
        VirusSpread();

    }
}
