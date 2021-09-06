import java.util.Scanner;

public class FncnFacto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        int felt = mean(n);
        System.out.println("Factorial of a number is " + felt);
    }

    private static int mean(int n) {
        int fact = 1;
        while (n > 0){
            fact = fact * n;
            n--;
        }
        return fact;
    }
}
