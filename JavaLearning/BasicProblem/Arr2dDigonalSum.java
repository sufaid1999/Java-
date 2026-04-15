// Q. Create a program to sum of digonal element of digonal element of an array.

import java.util.Scanner;

public class Arr2dDigonalSum{

    public void digonalSum( int [][] numArr){
        int sum = 0; 
            for(int i = 0; i<numArr.length; i++) {
                for(int j = 0; j<numArr[i].length; j++){
                    if(numArr.length != numArr[i].length){
                        System.out.println("Matrix should be Square matrix. Number of row and number of column should be equal.");
                        return;
                    }
                    else if((i==j) || (i+j == numArr.length - 1)){
                        sum += numArr[i][j];
                    }
                }
            }
            System.out.println("Sum of the digonal element is: " + sum);
    }
    public static void main(String[] args) {
        System.out.println("Here we are going to print the sum of digonal element of the 2D array.");
        try(Scanner sc = new Scanner(System.in)){
            int[][] numArr = ArrayUtility.array2dInput(sc);
            Arr2dDigonalSum Obj1 = new Arr2dDigonalSum();
            Obj1.digonalSum(numArr);
            
        }
    }
}