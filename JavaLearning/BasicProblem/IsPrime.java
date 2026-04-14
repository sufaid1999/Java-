// Q. Create a program to check Number is prime number or not.

import java.util.Scanner;

public class IsPrime {

    public void primeCheck(int num){
        if(num ==2 || num == 3){
            System.out.println(num + " is a prime number.");
        }else if (num > 3){
            int i = 2;
            while(i<num) {
                if(num % i == 0){
                    System.out.println(num + " is not a prime number.");
                    break;
                }i++;
            }
        }else{
            System.out.println("Please Enter a positive integer number instead of negative number.");
        }

    }
    public static void main(String[] args) {
        System.out.println("Here we will check entered number is prime or not.");
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("please enter a integer number: ");
            int num = sc.nextInt();
            IsPrime Obj1 = new IsPrime();
            Obj1.primeCheck(num);

        }
    }
    
}
