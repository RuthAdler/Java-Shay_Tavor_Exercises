import java.util.Scanner;
public class Echo {
    public static void main(String [] args){
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a number:"); 
        int number = scan.nextInt();
        System.out.println("Your number is "+ number);
    }
}


