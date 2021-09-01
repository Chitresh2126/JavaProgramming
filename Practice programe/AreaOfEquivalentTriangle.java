import java.util.Scanner;

public class AreaOfEquivalentTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Side of Triangle ");
        float side = scanner.nextFloat();
        System.out.println("Area of Equivalent Triangle is " + (Math.sqrt(3) * side * side) / 4);

    }
}
