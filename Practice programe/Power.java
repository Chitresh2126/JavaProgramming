import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number ");
        double a = scanner.nextDouble();
        System.out.println("Enter the power ");
        double b = scanner.nextDouble();
        System.out.println("Power of a number is " + Math.pow( a , b ));
    }
}
