import java.util.Scanner;

public class GreatestNumber {
    static double fNum;
    static double sNum;
    static double tNum;

    public void FindGreatestNumber(double fNum, double sNum, double tNum) {
        if(fNum >= sNum && fNum >= tNum){
            System.out.println(fNum + " is the greatest number.");
        }else if (sNum >= fNum && sNum >= tNum) {
            System.out.println(sNum + " is the greatest number");
        }else {
            System.out.println(tNum + " is the greatest number");
        }
    }
    
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.println("Here you know the Greatest number among these you entered.");
            System.out.print("Please Enter first number: ");
            double fNum = sc.nextDouble();
            System.out.print("Please Enter first number: ");
            double sNum = sc.nextDouble();
            System.out.print("Please Enter first number: ");
            double tNum = sc.nextDouble();
            GreatestNumber Obj1 = new GreatestNumber();
            Obj1.FindGreatestNumber(fNum, sNum, tNum);
           
        }
    }
}
