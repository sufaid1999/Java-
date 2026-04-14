//Q. Create a program to check if an array is a palindrome. (Hint: reverse the array and compare it with the original array)

import java.util.Scanner;

public class ArrPalindrome {
    public int[] reverseArray(int arr[]){
        int[] reversedArr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }

    public void checkPalindrome(int arr[], int reversedArr[]){
        boolean isPalindrome = true;
        for(int i=0; i<arr.length; i++){
            if(arr[i] != reversedArr[i]){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome){
            System.out.println("This array is a palindrome.");
        } else {
            System.out.println("This array is not a palindrome.");
        }
    }
    
    public static void main(String[] args) {
        System.out.println("Here we will reverse an array.");
        try(Scanner sc = new Scanner(System.in)){
            int[] arr = ArrayUtility.arrayInput(sc);
            ArrPalindrome Obj1 = new ArrPalindrome();
            int[] reversedArr = Obj1.reverseArray(arr);
            Obj1.checkPalindrome(arr, reversedArr);
        }
    }
    
}
