// Q. Create a program to reverse the digits of a number.

import java.util.Scanner;

public class ReverseDigit {

    public int printReverse (int num) {
        int reverse = 0;
        if (num > 0) {
            
            while(num !=0){
                reverse = (reverse*10) + (num % 10) ;
                num = num/10 ;
            }
        }else{
            System.out.println("This is not for negative number");
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println("Here we will reverse the digits of a number.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a number: ");
            int num = sc.nextInt();
            
            ReverseDigit Obj1 = new ReverseDigit();
            System.out.println("Entered number is: " + num);
            System.out.println("Reversed number is: "+ Obj1.printReverse(num));
        }
    }
    
}
