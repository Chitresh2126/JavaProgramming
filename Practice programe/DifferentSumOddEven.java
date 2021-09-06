import java.util.Scanner;

public class DifferentSumOddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to exit press 0 ");
        int sum_negative = 0;
        int n;
        int sum_odd = 0;
        int sum_even = 0;
        do{
            n = scanner.nextInt();
            if (n < 0){
                sum_negative = sum_negative + n;
            }
            else {
                if (n % 2 ==0){
                    sum_even = sum_even + n;
                }
                else {
                    sum_odd = sum_odd + n;
                }
            }
        }while (n != 0);
        System.out.println("Sum of negative number is " + sum_negative);
        System.out.println("Sum of even number is " + sum_even);
        System.out.println("Sum of odd number is " + sum_odd);
    }
}
