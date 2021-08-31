import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int item = scanner.nextInt();
        int root = 1;
        for(int count = 1 ; count <= item ; count++)
        {
            root = root * count;
        }
        System.out.println("The factorial number is " + root );
    }
}
