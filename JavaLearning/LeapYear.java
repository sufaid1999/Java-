//Q. Create a program that determines if a given year is a leap year (Considering conditions like divisible by 4 but not 100, unless also divisible by 400).

import java.util.Scanner;

public class LeapYear {
    static int year;

    public void FindLeapYearOrNot(int year) {
       if((year%4 == 0 && year%100 != 0) || year%400==0) {
        System.out.println(year + " is a leap year.");
       }else {
        System.out.println(year + " is not a leap year.");
       }
    }
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Here we will check that input year is leap year or not.");
            System.out.print("Please Enter a year: ");
            int year = sc.nextInt();
            LeapYear Obj1 = new LeapYear();
            Obj1.FindLeapYearOrNot(year);
        }
    }
    
}
