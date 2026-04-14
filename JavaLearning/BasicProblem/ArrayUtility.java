//In this class we will write a program which take element as an input for the array. So, that we can inherit this class instead of writing all code again and again.

import java.util.Scanner;

public class ArrayUtility {
    public static int[] arrayInput(Scanner sc) {
        System.out.println("Now we will take input element.");

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        if(size<=0){
            System.out.println("Invalid size.");
            return new int[0];
        }
        int[] arr = new int[size];
        for(int i = 0; i<size; i++){
            System.out.print("Enter a element: ");
            arr[i] = sc.nextInt();
        }

        
        return arr;
    }

    
    
}
