// Create a program to check if a number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNum {
    public boolean isArmstrong(int num){
        int original = num;
        int sum = 0;

        // count digit
        int digits = String.valueOf(num).length();

        // Process each digit
        while(num !=0){
            int digit = num % 10 ;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        return sum == original;
    }

    
    public static void main(String[] args) {
        System.out.println("Here we check a number is Armstrong number or not.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int num =sc.nextInt();
            ArmstrongNum Obj1 = new ArmstrongNum();
            if (Obj1.isArmstrong(num)){
                System.out.println(num + " is an Armstrong number.");
            } else {
                System.out.println(num + " is not an Armstrong number");
            }
        }
    }
} 
        
    

    

