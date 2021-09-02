import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;

        }
        System.out.println("Reverse of a number is " + ans );
    }
}
