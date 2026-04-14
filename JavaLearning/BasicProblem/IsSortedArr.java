//Q. Create a program to check if the given array is sorted.

import java.util.Scanner;

public class IsSortedArr{
    public boolean isIncreasing(int[] numArr){
        for(int i= 0; i<(numArr.length-1); i++){
            if(numArr[i]>numArr[i+1]){
                return false;
            }
        }
        return true;
    }

    public boolean isDecreasing(int[] numArr){
        for(int i= 0; i<(numArr.length-1); i++){
            if(numArr[i]<numArr[i+1]){
                return false;
            }
        }
        return true;
    }

    public void isSorted(boolean isIncreased, boolean isDecreased){
        if(isIncreased || isDecreased){
            System.out.println("This array is sorted.");
        }else {
            System.out.println("This array is not sorted.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Here we will check array is sorted or not.");
        try(Scanner sc = new Scanner(System.in)){
            int[] numArr = ArrayUtility.arrayInput(sc);
            IsSortedArr Obj1 = new IsSortedArr();
            boolean isIncreased = Obj1.isIncreasing(numArr);
            boolean isDecreased = Obj1.isDecreasing(numArr);
            Obj1.isSorted(isIncreased, isDecreased);



        }
        
    }
    
}
