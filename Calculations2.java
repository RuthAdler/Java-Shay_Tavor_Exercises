import java.util.Scanner;

public class Calculations2 {
    public static void main(String [] args){
        float num1;
        System.out.println("Please enter a number:");
        Scanner in = new Scanner (System.in);
        num1 = in.nextFloat();
        float _inverse = 1/num1;
        float _opposite = -1* num1;
        System.out.println("Inverse of " + num1 + " is "
        + _inverse + ", opposite of " + num1 + " is " + _opposite);
        
    }
}
