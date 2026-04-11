//Q. Create a program to find the sum and average of all element in an array.

import java.util.Scanner;

public class ArraySumAvg {
    public static void main(String[] args) {
        System.out.println("Here we will find the sum and avg of an array element.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter the size of array:");

            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.print("Enter "+ n + " elements:");
            for (int i = 0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            for(int i= 0; i<n; i++){
                sum += arr[i];
            }

            double avg = sum / n ;

            System.out.println("Sum of these elements is: "+ sum);
            System.out.println("Average of these element is: "+ avg);

        }
    }
    
}
