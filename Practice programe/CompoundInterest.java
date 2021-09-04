import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter initial principal balance ");
        float p = scanner.nextFloat();
        System.out.println("Enter interest rate ");
        float r = scanner.nextFloat();
        System.out.println("Enter number of times interest applied per time period ");
        float n = scanner.nextFloat();
        System.out.println("Enter number of time periods elapsed ");
        float t = scanner.nextFloat();
        float compound = (float) (p * Math.pow((1 + (r / n)),( n * t)));
        System.out.println("Compound interest of a number is " + compound);
    }
}
