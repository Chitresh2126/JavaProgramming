import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int hcf = 1;
        for (int i = 1 ; i <= n1 && i <= n2 ; ++i){
            if (n1 % i == 0 && n2 % i == 0)
            hcf = i;
        }
        System.out.println("HCF of " + n1 + " " + n2 + " " + hcf);
    }
}
