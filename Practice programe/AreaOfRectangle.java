import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Length of rectangle ");
        int length = scanner.nextInt();
        System.out.println("Enter breadth of rectangle ");
        int breadth = scanner.nextInt();
        System.out.println("Area of Rectangle is " + length * breadth);
    }
}
