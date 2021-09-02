import java.util.Scanner;

public class CountingOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to Find Counting Occurence ");
        int n = scanner.nextInt();
        int count = 0;
        while (n > 0){
            int rem = n % 10;
            if (rem == 9){
                count++;

            }
            n = n / 10;
        }
        System.out.println("Number of Digits is " + count );
    }
}
