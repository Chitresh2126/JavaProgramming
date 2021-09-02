import java.util.Scanner;

public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a side of Square ");
        int side = scanner.nextInt();
        System.out.println("Perimeter of Square is " + 4 * side );
    }
}
