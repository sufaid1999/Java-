// Q. Develope a program that prints the myltiplication table for a given number.

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int number){
        System.out.println("\n\n\nTable of "+ number);
        int i=1;
        while(i<=10){
            System.out.println(number + " * " + i + " = " + (number*i));
            i++;
        }
    }
    public static void main(String [] args){
        System.out.println("Here we will print the table of the number you entered");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int number = sc.nextInt();

            MultiplicationTable Obj1 = new MultiplicationTable();
            Obj1.printTable(number);
        }

    }
}
