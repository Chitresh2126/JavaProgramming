import java.util.Scanner;

public class Largernumber {
    public static void main(String[] args) {
        Scanner symbol = new Scanner(System.in);
        System.out.println("Enter two numbers Num1 and Num2 ");
        int num1 = symbol.nextInt();
        int num2 = symbol.nextInt();
        if( num1 > num2 )
        {
            System.out.println("Larger number is " + num1);
        }
        else {
            System.out.println("Larger number is " + num2);
        }


    }
}
