//Q. Create a program to find number of occurences of an element inn an array. Occurences means search a element how many times appear in array.

import java.util.Scanner;

public class OccurencesArray {
    

    public int occureElement(int arr[], int searchElement){
        int count = 0;

        for(int num : arr){
            if(num == searchElement){
                count ++;
            }
        }
        /*
        int i = 0;
        while (i< arr.length){
            if(searchElement == arr[i]){
                count ++;
            }
            i++;
        }
        */

        return count;
    }
    public static void main(String[] args) {
        System.out.println("Here we will see how many times a specific number appear in an array. ");
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a total number of element: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            int i = 0;
            while (i < size){
                System.out.print("Plese enter a element: ");
                arr[i] = sc.nextInt();
                i++;
            }

            System.out.print("Please enter a element you want to find how many times it appear in this array: ");
            int searchElement = sc.nextInt();
            OccurencesArray Obj1 = new OccurencesArray();
            System.out.println("Occurences of element " + searchElement + " in this array is: " + Obj1.occureElement(arr, searchElement) + " times.");


        }
    }
    
}
