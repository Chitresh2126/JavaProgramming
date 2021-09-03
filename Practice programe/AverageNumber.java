import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limits How much you want ? ");
        int limit = scanner.nextInt();
        int count = 0;
        float view = 0;
        while(limit > 0){
            int n = scanner.nextInt();
            view = view + n;
            count++;
            limit--;
        }
        System.out.println("Average of all number is " + view / count);
    }
}
