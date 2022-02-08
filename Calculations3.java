import java.util.Scanner;

public class Calculations3 {
    public static void main(String [] args){
        float num1;
        System.out.println("Please enter a number:");
        Scanner in = new Scanner (System.in);
        num1 = in.nextFloat();
        double _sqrt = Math.sqrt(num1);
        double _abs =Math.abs(num1);
        System.out.println("Square root of " + num1 + " is "
        + _sqrt + ", Absolute value " + num1 + " is " + _abs);
        
        
    }
}
