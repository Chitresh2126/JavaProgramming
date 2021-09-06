import java.util.Scanner;

public class FncnAddProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int addition = add(n1 , n2);
        int product = pro(n1 , n2);
        System.out.println("Addition of two number is " + addition);
        System.out.println("Subtraction of two number is " + product);
    }

    private static int pro(int n1, int n2) {
        int mul = n1 * n2;
        return mul;
    }

    private static int add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
}
