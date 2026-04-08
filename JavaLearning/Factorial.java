// Q. Write a function that calculates the factorial of a given number.

import java.util.Scanner;

public class Factorial {
    int factorial;

    public int printFactorial(int number){
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Herer we are going to find the factorial of any number");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Please Enter a number: ");
            int number = sc.nextInt();
            Factorial Obj1 = new Factorial();
            System.out.println("Factorial of " + number + " is: " + (Obj1.printFactorial(number)));

        }
    }
    
}
