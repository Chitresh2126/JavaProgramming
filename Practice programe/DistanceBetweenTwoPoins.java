import java.util.Scanner;

public class DistanceBetweenTwoPoins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 of point one ");
        float x1 = scanner.nextFloat();
        System.out.println("Enter y1 of point one ");
        float y1 = scanner.nextFloat();
        System.out.println("Enter x2 of point two ");
        float x2 = scanner.nextFloat();
        System.out.println("Enter y2 of point two ");
        float y2 = scanner.nextFloat();
        float distance = (float) java.lang.Math.sqrt( (( x2 - x1 ) * ( x2 - x1 )) + (( y2 - y1 ) * ( y2 - y1 )) );
        System.out.println("Distance between two point is " + distance);
    }
}
