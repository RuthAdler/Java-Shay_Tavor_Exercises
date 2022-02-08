import java.util.Scanner;
public class SquareAndCube  {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number:"); 
        double number = scan.nextFloat();
        double number2 = Math.pow(number,2);
        double number3 = Math.pow(number,3);
        System.out.println("Number:"+ number + ", Squere:" +number2+", Cube:" +number3 );
    }
}

