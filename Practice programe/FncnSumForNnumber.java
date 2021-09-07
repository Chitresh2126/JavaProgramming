import java.util.Scanner;

public class FncnSumForNnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        System.out.println("Sum of all natural number is " + Add(n));
    }

    private static int Add(int n) {
        int sum = 0;
        for (int i = 1; i <= n ; i++){
            sum = sum + i;

        }
        return sum;
    }
}
