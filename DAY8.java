import java.util.Scanner;
public class Day8
{
	public static void PoliceTheif () 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t<T; t++){
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		int timeToCatch = Math.abs(X - Y);
            
            // Output the result for the current test case
            System.out.println(timeToCatch);
		
          }
	}



	public static void Partition() 
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t = 0; t<T ; t++){
		    int N = sc.nextInt();
		    int[] A = new int[N];
		    int oddCount = 0;
		    
		    
		    for (int i = 0; i < N ; i++){
		        A[i] = sc.nextInt();
                // Count how many numbers are odd
                if (A[i] % 2 != 0) {
                    oddCount++;
                }
		     }
		      if (oddCount >= 2) {
                System.out.println("YES");
              } else {
                System.out.println("NO");
                  
              }
		}
		
		

	}
    public static void main(String[] args){
        System.out.println("Police and theif:");
        PoliceTheif();

        System.out.println("Partition of array:");
        Partition();
    }
}

