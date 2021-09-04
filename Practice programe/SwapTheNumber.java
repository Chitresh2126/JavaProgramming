import java.util.Scanner;

public class SwapTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X number");
        int a = scanner.nextInt();
        System.out.println("Enter Y number");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap program is " + a + " " + b );
    }

}
