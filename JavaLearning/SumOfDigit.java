// Q. Create program that computes the sum of the digits of an integer.

import java.util.Scanner;

public class SumOfDigit {

    public int printSumOfDigit(int number){
        number = Math.abs(number); //make negative number to positive.
        int sum = 0;
        while (number !=0) {
            sum = sum + (number % 10);
            number = number / 10 ;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Here we will find the sum of all digit in an integer.");

        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a integer number: ");
            int number = sc.nextInt();

            SumOfDigit Obj1 = new SumOfDigit();
            System.out.println("Sum of all digits of " + number + " is: " + Obj1.printSumOfDigit(number));

        }
    }
    
}
