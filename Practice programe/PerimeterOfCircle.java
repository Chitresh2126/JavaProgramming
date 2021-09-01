import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of circle ");
        float radius = scanner.nextFloat();
        System.out.println("Perimeter of a Circle is " + ( 2 * 3.14 * radius ));
    }
}
