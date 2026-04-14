//Q.Create a program to merge two sorted arrays into a single sorted array. (Hint: create a new array and use two pointers to compare elements from both arrays and copy the smaller one into the new array)

import java.util.Scanner;

public class MergeTwoSortArr {
    public int[] mergeSortedArrays(int arr1[], int arr2[]){
        int mergedArr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length){
            if(arr1[i] < arr2[j]){
                mergedArr[k] = arr1[i];
                i++;
            } else {
                mergedArr[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            mergedArr[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mergedArr[k] = arr2[j];
            j++;
            k++;
        }
        return mergedArr;
    }
    public void printMergedArr(int mergedArr[]){
        System.out.print("Merged array is: ");
        for(int num : mergedArr){
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Here we will merge two sorted arrays into a single sorted array.");
        try(Scanner sc = new Scanner(System.in)){
            int[] arr1 = ArrayUtility.arrayInput(sc);
            int[] arr2 = ArrayUtility.arrayInput(sc);
            MergeTwoSortArr Obj1 = new MergeTwoSortArr();
            int[] mergedArr = Obj1.mergeSortedArrays(arr1, arr2);
            Obj1.printMergedArr(mergedArr);

        }

    }
    
}
