import java.util.Scanner;

public class Calculations1 {
    public static void main(String [] args){
        float num1, num2;
        System.out.println("Please enter 2 numbers:");
        Scanner in = new Scanner (System.in);
        num1 = in.nextFloat();
        num2 = in.nextFloat();
        System.out.println(num1+" + "+num2+" = "+ (num1+num2));
        System.out.println(num1+" - "+num2+" = "+ (num1- num2));
        System.out.println(num1+" * "+num2+" = "+ num1*num2);
        System.out.println(num1+" / "+num2+" = "+ num1/num2);
        
    }
}



