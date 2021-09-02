import java.util.Scanner;

public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Radius of Cone ");
        float radius = scanner.nextFloat();
        System.out.println("Enter Height os Cone ");
        float heigh = scanner.nextFloat();
        System.out.println("Volume of Cone is " + (3.14 * radius * radius * heigh) / 3 );
    }
}
