//Q. Create a program that calculates grades based on marks

import java.util.Scanner;

public class Result {
      int EEES;
      int OS;
      int ADA;
      int SE;
      int AI;
      int TotalObtainedMarks;
      double Percentage;

    public void marksResult(int EEES, int OS, int ADA, int SE, int AI){

        System.out.println("Marks obtained in EEES = " + EEES);
        System.out.println("Marks obtained in OS = " + OS);
        System.out.println("Marks obtained in ADA = " + ADA);
        System.out.println("Marks obtained in SE = " + SE);
        System.out.println("Marks obtained in AI = " + AI);

        TotalObtainedMarks = (EEES + OS + ADA + SE + AI);
        Percentage = ((TotalObtainedMarks / 500.0) * 100) ;

        System.out.println("Total Obtained marks = "+ TotalObtainedMarks);
        System.out.println("Total Percentage = " + Percentage + "%");

        if(EEES >= 35 && OS >= 35 && ADA >= 35 && SE >= 35 && AI >= 35) {
            if(Percentage >= 90){
                System.out.println("Your grade is A");
            }else if (Percentage >= 75) {
                System.out.println("Your grade is B");
            }else if (Percentage >= 60) {
                System.out.println("Your grade is C");
            }else if (Percentage >= 45) {
                System.out.println("Your grade is D");
            }else {
                System.out.println("You need to try very Hard seriously");
            }
        }else {
            System.out.println("You are FAIL so you need to try next year.");
        }   
    }

    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Here we are going to check wether you are pass or fail and decide the grade that will you earn.");
            System.out.print("Please enter marks of EEES: ");
            int EEES = sc.nextInt();
            System.out.print("Please enter marks of OS: ");
            int OS = sc.nextInt();
            System.out.print("Please enter marks of ADA: ");
            int ADA = sc.nextInt();
            System.out.print("Please enter marks of SE: ");
            int SE = sc.nextInt();
            System.out.print("Please enter marks of AI: ");
            int AI = sc.nextInt();

            Result Obj1 = new Result();
            Obj1.marksResult(EEES, OS, ADA, SE, AI);
            
        }
    }
    
}
