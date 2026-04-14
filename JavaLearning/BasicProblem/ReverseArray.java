//Q.Create a program to reverse an array. (Hint: create a new array and copy all elements in reverse order)

import java.util.Scanner;

public class ReverseArray {
    public int[] reverseArray(int arr[]){
        int[] reversedArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public void printReversedArr(int reversedArr[]){
        System.out.print("Reversed array is: ");
        for(int num : reversedArr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Here we will reverse an array.");
        try(Scanner sc = new Scanner(System.in)){
            int[] arr = ArrayUtility.arrayInput(sc);
            ReverseArray Obj1 = new ReverseArray();
            int[] reversedArr = Obj1.reverseArray(arr);
            Obj1.printReversedArr(reversedArr);
        }
    }
    
}
