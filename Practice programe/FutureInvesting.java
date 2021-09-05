import java.util.Scanner;

public class FutureInvesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of years to invest ");
        int yr = scanner.nextInt();
        System.out.println("Enter first investment price ");
        int fr = scanner.nextInt();
        int ms = ( yr * 12 ) * fr ;
        System.out.println("Enter no of percent you work with ");
        int p = scanner.nextInt();
        int per = ( ms * p ) / 100;
        int total = ms + per;
        System.out.println("After all profit your investment value is " + total);
        System.out.println("Total profit is " + per);
    }
}
