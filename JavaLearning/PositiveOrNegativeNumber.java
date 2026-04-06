//Q. Create a program to determine a number is Positive, Negative or Zero.

import java.util.Scanner;

public class PositiveOrNegativeNumber {

    public double number;

    public void  TypeNumber(double number) {
        this.number = number;
        if(number>0){
            System.out.println("Entered number is positive number.");
        } 
        else  if(number<0){
            System.out.println("Entered number is negative number");
        }
        else
            System.out.println("Entered number is Zero.");
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            double number = sc.nextDouble();
            System.out.println("Entered number is: "+ number);
            PositiveOrNegativeNumber obj1 = new PositiveOrNegativeNumber();
            obj1.TypeNumber(number);
        }
        
    }

    

    
    
}
