import java.util.Scanner;

public class FncnCircleAreaCircumference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius of circle ");
        int rad = scanner.nextInt();
        float circum = circumference(rad);
        float area = areacircle(rad);
        System.out.println("Area of a circle is " + area);
        System.out.println("Circumference of a circle is " + circum);
    }

    private static float areacircle(int rad) {
        float a = (float) (3.14 * rad * rad);
        return a;
    }

    private static float circumference(int rad) {
        float b = (float) ( 2 * 3.14 * rad);
        return b;
    }
}
