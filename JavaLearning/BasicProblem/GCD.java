// Q. Create a program to find the Greatest Common Divisior of two number.

import java.util.Scanner;

public class GCD {
    public int GCDis(int num1, int num2){
        int gdc = 1;
        int i = 2;
        while(i <= num1){
            if((num1 % i ==0) && (num2 % i == 0)){
                gdc = i;
                return gdc;

            }
            i++;
        }

        return gdc;
    }


    public static void main(String[] args) {
        System.out.println("Here we will find the Greatest Common Divisior (GCD).");

        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a first integer number: ");
            int num1 = sc.nextInt();
            System.out.print("Please enter a Second integer number: ");
            int num2 = sc.nextInt();

            GCD Obj1 = new GCD();
            System.out.println("GCD of these two number " + num1 + " and " + num2 + " is: "+ Obj1.GCDis(num1, num2));
        }
    }
     
}
