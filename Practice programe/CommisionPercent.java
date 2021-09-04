import java.util.Scanner;

public class CommisionPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter written price ");
        int printed = scanner.nextInt();
        System.out.println("Enter final price ");
        int fp = scanner.nextInt();
        float dp = (100 - ((fp * 100) / printed));
        System.out.println("Giving discount is " + dp);

    }
}
