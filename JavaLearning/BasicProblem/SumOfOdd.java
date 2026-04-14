// Q. Write a program to Sum of all odd number from 1 to entered number.

import java.util.Scanner;

public class SumOfOdd {

    public int printSumOfOdd(int number) {
        int sum = 0;
        int i = 1;
        while (i<= number) {
            if(i % 2 !=0) {
                sum += i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Here we are goint to sum of all the odd number from 1 to specific entered number. ");
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Please Enter a number: ");
            int number = sc.nextInt();
            SumOfOdd Obj1 = new SumOfOdd();
            System.out.println("Sum of Odd number from 1 to " + number + " = " + (Obj1.printSumOfOdd(number)));

        }
    }
}
