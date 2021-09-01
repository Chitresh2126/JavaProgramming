import java.util.Scanner;

public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Base of Parallelogram ");
        int base = scanner.nextInt();
        System.out.println("Enter Side of Parallelogram ");
        int side = scanner.nextInt();
        System.out.println("Perimeter of Parallelogram is " + 2 * ( base + side ));
    }
}
