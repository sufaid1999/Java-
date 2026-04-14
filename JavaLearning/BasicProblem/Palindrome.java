// Q. Create a program to verify if a number is a Plaindrome.

import java.util.Scanner;

public class Palindrome {

    public void palindrome (int num) {
        int original = num;
        int reverse = 0;
        if (num > 0) {
            
            while(num !=0){
                reverse = (reverse*10) + (num % 10) ;
                num = num/10 ;
            }
            if(original == reverse){
                System.out.println(original + " is a palindrome.");
            }else {
                System.out.println(original + " is not a palindrome number.");
            }
        }else{
            System.out.println("please enter a positive integer.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Here we will verify number is palindrome or not.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            
            Palindrome Obj1 = new Palindrome();
            System.out.println("Entered number is: " + num);
            Obj1.palindrome(num);
        }
    }
    
}

