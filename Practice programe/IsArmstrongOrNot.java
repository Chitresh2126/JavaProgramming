import java.util.Scanner;

public class IsArmstrongOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        System.out.println(IsArmstrong(n));
    }
    static boolean IsArmstrong( int n){
        int original = n;
        int ans = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans + rem*rem*rem;

        }
        return ans == original;
    }
}
