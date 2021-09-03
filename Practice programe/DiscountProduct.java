import java.util.Scanner;

public class DiscountProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product Price ");
        int product = scanner.nextInt();
        System.out.println("Enter giving Discount ");
        int disc = scanner.nextInt();
        float finalprice = ( product * disc) / 100 ;
        System.out.println("Final price of a Product is " + finalprice);
    }
}
