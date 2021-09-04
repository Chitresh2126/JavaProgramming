import java.util.Scanner;

public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter V1 to find Depreciation Value ");
        float v1 = scanner.nextFloat();
        System.out.println("Enter R to find Depreciation Value ");
        float r = scanner.nextFloat();
        System.out.println("Enter T to find Depreciation Value ");
        float t = scanner.nextFloat();
        float v2 = (float) (v1 * Math.pow((1 - (r / 100)),t));
        System.out.println("The Depreciation Value is " + v2);
    }
}
