//Q. Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

public class FibonacciSeries {
    public void printFibonacci(int num){
        int first = 0 , second = 1;
        if(num <= 0){
            System.out.println("Fibonacci series is: " + num);
            return;
        }else if (num == 1) {
            System.out.println("Fibonacci Series is: "+ first + "," + second);
            return;
        }else if(num>1){
            System.out.print(first + ", " + second );
            while ((first + second) <= num){
                first = second ;
                second = first + second ;
                if((first + second) < num ){
                    System.out.println("," + second);
                }
                
            }
        }
        
        
    }
    public static void main(String[] args) {
        System.out.println("Here we will find the Fibonacci series till the number user put.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            FibonacciSeries Obj1 = new FibonacciSeries();
            Obj1.printFibonacci(num);
        }
    }
}
