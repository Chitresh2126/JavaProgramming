import java.util.Scanner;

public class AreaOfcircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of circle ");
        float radius = scanner.nextFloat();
        float  Area = (float) (3.14 * radius * radius);
        System.out.println("Area of Circle is " + Area );

    }
}
