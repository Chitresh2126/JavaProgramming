import java.util.Scanner;

public class M_A_S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = scanner.nextInt();
        int mul = 1;
        int sum = 0;
        int difference = 0;
        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            mul = mul * rem;
            sum = sum + rem;
            difference = mul - sum;
        }
        System.out.println("Product of a number is " + mul);
        System.out.println("Summation of a number is " + sum);
        System.out.println("Difference of Product and Summation is " + difference);
    }
}
