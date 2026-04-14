// Q. Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Factorial {

    public int printFactorial(int number){
        if(number < 0) {
            System.out.println("Factorial of a negative number is not possible.");
            return 0;
        }

        // Using normal logic without using Recursion
        int i= number;
        int factorial = 1;
        while (i>=1){
            factorial = factorial * i;
            i--;

        }
        return factorial;
    }
    
    // Using recursion 
    public int recursionFactorial(int number) {
        if(number == 0 || number == 1){
            return 1;
        }
        return number * recursionFactorial(number - 1);
    }
    public static void main(String[] args) {
        System.out.println("Herer we are going to find the factorial of any number");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Please Enter a number: ");
            int number = sc.nextInt();
            Factorial Obj1 = new Factorial();
            System.out.println("Factorial of " + number + " is: " + (Obj1.printFactorial(number)));
            System.out.println("Factorial of " + number + " using recursion is: " + (Obj1.recursionFactorial(number)));

        }
    }
    
}
