// Q. Create a program to find the maximum and minimum element in an array.

import java.util.Scanner;

public class MaxMinElementArr {
    public void maxMinElement(int arr[]){
        int max =arr[0];
        int min =arr[0];
        if(arr.length <= 0){
            System.out.println("Invalid size");
            return;
        }
        for(int i=1; i<(arr.length); i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i]< min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element in this array is: " + max);
        System.out.println("Minimum element in this array is: " + min);
        
    }
    public static void main(String[] args) {
        System.out.println("Here we will find the maximum and minimum number in an array.");
        try(Scanner sc = new Scanner(System.in)){
            int[] arr = ArrayUtility.arrayInput(sc);
            MaxMinElementArr Obj1 = new MaxMinElementArr();
            Obj1.maxMinElement(arr);
            

        }

    }
    
}
