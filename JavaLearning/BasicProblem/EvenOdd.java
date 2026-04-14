//Q. Create a program that determines if a number is odd or even

import java.util.Scanner;

public class EvenOdd{
    int number;
    public void EvenOrOdd(int number) {
        this.number = number;
        if(number%2 == 0){
            System.out.println(number + " is an even number");
        }else {
            System.out.println(number + " is an odd number");

        }
        
    }


    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Here you know the input number is odd or even.");
            System.out.print("Please Enter a number: ");
            int number = sc.nextInt();
            if((number & 1) == 1){
                System.out.println(number + " is a odd number using Bitwise operator. ");
            }else {
                System.out.println(number + " is an even number using Bitwise operator.");
            }
            EvenOdd Obj1 = new EvenOdd();
            Obj1.EvenOrOdd(number);
        }
    }

}