//Q.Create a program to return a new array deleting a specific element. (Hint: create a new array and copy all elements except the element you want to delete)

import java.util.Scanner;

public class DeleteElementArr {
    public int[] deleteElement(int arr[], int deleteElement){
        int count = 0;
        for(int num : arr){
            if(num == deleteElement){
                count++;
            }
        }

        int newArr[] = new int[arr.length - count];
        int j = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i] != deleteElement){
                newArr[j] = arr[i];
                j++;
            }
        }
        return newArr;
    }
    public void printNewArr(int newArr[]){
        System.out.println("New array after deleting element is: ");
        for(int num : newArr){
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("Here we will delete a specific element from an array and return a new array.");
        try(Scanner sc = new Scanner(System.in)){
            int[] arr = ArrayUtility.arrayInput(sc);
            System.out.print("Please enter a element you want to delete from this array: ");
            int deleteElement = sc.nextInt();
            DeleteElementArr Obj1 = new DeleteElementArr();
            int[] newArr = Obj1.deleteElement(arr, deleteElement);
            System.out.println("New array after deleting element " + deleteElement + " is: ");
            Obj1.printNewArr(newArr);

        }
    }
    
}

