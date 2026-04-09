// Q. Create a program to find the Least Common Multiple (LCM) of two numbers.

import java.util.Scanner;

public class LCMOfTwoNum {
    public int LCMis(int num1, int num2){
        int lcm;
        int i = 1;
        while(i<=num2){         // while (true) is optimal.
            lcm = num1 * i ;
            if (lcm % num2 == 0) {
                return lcm;
            }
            i++;
        }
    return 0;
    }
    public static void main(String[] args) {
        System.out.println("Here we will find the Least Common Multiple (LCM).");

        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Please enter a integer number: ");
            int num1 = sc.nextInt();
            System.out.print("Please enter a integer number: ");
            int num2 = sc.nextInt();

            LCMOfTwoNum Obj1 = new LCMOfTwoNum();
            System.out.println("LCM of these two number " + num1 + " and " + num2 + " is: "+ Obj1.LCMis(num1, num2));
        }
    }
    
}
