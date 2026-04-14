//Q. Create a program to do sum and average of all elements in a 2D array.

import java.util.Scanner;

public class SumAvg2DArrElement {
    public int addition(int[][] numArr){
        int sum = 0;
        for(int i = 0; i<numArr.length; i++){
            for(int j = 0; j<numArr[i].length; j++){
                sum += numArr[i][j];
            }
        }

        return sum;
    }

    public double average(int numArr[][], int sum){
        int totalElement = 0;

        for(int i = 0; i<numArr.length; i++){
            totalElement += numArr[i].length;
        }

        double avg = sum/(totalElement);
        return avg ;
    }

    public static void main(String[] args) {
        System.out.println("Here we will find sum and avg of element of 2D array.");
        try(Scanner sc = new Scanner(System.in)){
            int[][] numArr = ArrayUtility.array2dInput(sc);
            SumAvg2DArrElement Obj1 = new SumAvg2DArrElement();
            int elementSum = Obj1.addition(numArr);
            System.out.println("Sum of these element is: "+ elementSum);
            System.out.println("Average of these element is: "+ Obj1.average(numArr, elementSum));


        }
    }
}
