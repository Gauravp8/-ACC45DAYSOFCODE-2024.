//Q1. Average Comparison

import java.util.Scanner;

public class Day11 {
    public static void AverageComparison() {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();
            
            double average = (A + B) / 2.0;
            
            if (average > C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        
    }

//Q2. Subscriptions 
    public static void Subscriptions() {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int subscriptions = (N + 5) / 6;  
            
            int totalCost = subscriptions * X;
            
            System.out.println(totalCost);
        }
        
        
    }

    public static void main(String[] args){
        System.out.println("Average Comparison: ");
        AverageComparison();

        System.out.println("Subscriptions: ");
        Subscriptions();

    }
}
