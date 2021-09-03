import java.util.Scanner;

public class ElectricBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the units in KWH ");
        float n = scanner.nextFloat();
        float bill = 7 * n;
        System.out.println("Total amount of bill according to given units is " + bill);
    }
}
