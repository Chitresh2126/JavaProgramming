import java.util.Scanner;

public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Radius of Sphere ");
        float radius = scanner.nextFloat();
        System.out.println("Volume of Sphere is " + ( (4 * 3.14 * radius * radius * radius ) / 3 ));
    }
}
