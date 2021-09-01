import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Height of triangle ");
        float high = scanner.nextFloat();
        System.out.println("Enter Base of triangle");
        float base = scanner.nextFloat();
        System.out.println("Area of Triangle is " + (float) ((high * base) / 2));
    }
}
