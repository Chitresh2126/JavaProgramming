import java.util.Scanner;

public class FncnPrimeOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        boolean p = prime(n);
        if (!p){
            System.out.println("Prime ");
        }
        else {
            System.out.println("Not Prime ");
        }
    }

    private static boolean prime(int n) {
        boolean flag = false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                flag = true;
                break;

            }


        }
        return flag;
    }
}
