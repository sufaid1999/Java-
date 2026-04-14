//Q. Create a program to print the Fibonacci series up to a certain number.

import java.util.Scanner;

public class FibonacciSeries {
    public void printFibonacci(int num){ // This will print Fibonacci series under that number.
        int first = 0 , second = 1;
        System.out.println("this is Fibonacci series under "+ num);
        if (num < 0) {
            System.out.println("Invalid Input.");
            return;
        }

        while (first <= num) {
            
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public void printFirstFibonacci (int num){
        System.out.println("This is first " + num + " Fibonacci number.");
        int first = 0, second=1 ;
        for (int i= 1; i<=num; i++) {
            System.out.print(first + " ");
            int third = first + second ;
            first = second ;
            second = third ;
        }
    }


    public static void main(String[] args) {
        System.out.println("Here we will find the Fibonacci series till the number user put.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            FibonacciSeries Obj1 = new FibonacciSeries();
            Obj1.printFibonacci(num);
            System.out.println("\n \n ");
            Obj1.printFirstFibonacci(num);
        }
    }
}
