
import java.util.Scanner;

public class Palindrone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        int original = n;
        int rem;
        int ans = 0;
        while (n > 0){
            rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;

        }
        if (original == ans) {
            System.out.println("The number is palindrone ");
        } else {
            System.out.println("The number is not palindrone ");
        }
    }


}

