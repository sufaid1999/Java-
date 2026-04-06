//Q.Create a program to calculate simple interest and compound interest.

import java.util.Scanner;

public class Intrest {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {

            System.out.print("Please enter a value of Principal: ");
            double Principal = sc.nextDouble();
            System.out.print("Please enter value of Rate of interest: ");
            double Rate = sc.nextDouble();       // per year in %
            System.out.print("Please enter time: ");
            double Time = sc.nextDouble();       // in year

            //This is for Simple Interest
            double SimpleInterest = (Principal * Rate * Time)/100 ;
            System.out.println("The Simple Interest is: "+ SimpleInterest);

            //This is for Compound Interest
            double A = Principal * Math.pow((1 + (Rate/100)), Time);
            double CompoundInterest = A - Principal ;
            System.out.println("The Compound Interest is: "+ CompoundInterest);

        }   
    }
    
}
