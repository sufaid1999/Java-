//Q.WAP to swap number between two variable.

import  java.util.Scanner;

public class Swap{
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
        System.out.println("Here we will swap number between two variable");
        
        // Now we will take input from the user
        System.out.print("Please enter a value of a: ");
        int a = sc.nextInt();
        System.out.print("Please enter a value of b: ");
        int b = sc.nextInt();
        

        // We are showing Entered value before Swapping
        System.out.println("Entered value of a is:"+ a );
        System.out.println("Entered value of b is:"+ b );

        // Swapping using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapping is done");
        System.out.println("Now value of a is: "+ a);
        System.out.println("now value of b is: "+ b);

        // Swapping using addition & subtraction (Without using third variable)
        // It can cause integer overflow if numbers are large.
        a = a + b ;
        b = a - b ;
        a = a - b ;
        System.out.println("Swapping is done");
        System.out.println("Now value of a is: "+ a);
        System.out.println("now value of b is: "+ b);

        // Swapping using multiplication & division (This method will fails if value of a or b is 0)
        // This can Risk for overflow.
        a = a * b ;
        b = a / b ;
        a = a / b ;
        System.out.println("Swapping is done");
        System.out.println("Now value of a is: "+ a);
        System.out.println("now value of b is: "+ b);

        // Swapping using XOR (Bitwise Operator)
        a = a ^ b ;
        b = a ^ b ;
        a = a ^ b ;
        System.out.println("Swapping is done");
        System.out.println("Now value of a is: "+ a);
        System.out.println("now value of b is: "+ b);

        // Swappin using one line trick (Java Expression)
        // Not use in real projects
        b = a + b - (a = b) ;
        System.out.println("Swapping is done");
        System.out.println("Now value of a is: "+ a);
        System.out.println("now value of b is: "+ b);

        // // Swapping using array
        // int[] arr = {a, b};
        // int temp = arr[0];
        // int[0] = arr[1];
        // arr[1] = temp;
        // a = arr[0];
        // b = arr[1];
        }
    }
}