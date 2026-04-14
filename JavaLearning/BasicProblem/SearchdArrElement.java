//Q. Create a program to search an element in a 2-D array.

import java.util.Scanner;

public class SearchdArrElement{
    public static void main(String[] args) {
        System.out.println("Here we will Search element in 2D array.");
        try(Scanner sc = new Scanner(System.in)){

            int [][] numArr = ArrayUtility.array2dInput(sc);

            System.out.print("Please enter a element you want to search: ");
            int searchElement = sc.nextInt();

            boolean found = false;

            for(int i = 0; i<numArr.length ; i++){
                for(int j = 0; j<numArr[i].length ; j++){
                    if(numArr[i][j]== searchElement){
                        System.out.println("Element is found at "+ i + ", " + j);
                        found = true;
                    }
                }

            }

            if(!found){
                System.out.println("Element is not found in this array.");
            }

        }
        
    }

}