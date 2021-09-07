import java.util.Scanner;

public class FncnPythagorean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean check = prthagorous(a , b , c);
        System.out.println("Given no is " + check);
    }

    private static boolean prthagorous(int a, int b, int c) {
        int A = a * a;
        int B = (b * b) + (c * c);
        return A == B;
    }
}
