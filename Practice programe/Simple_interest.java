import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {
        Scanner intst = new Scanner(System.in);
        System.out.println("Enter P ");
        float p = intst.nextFloat();
        System.out.println("Enter R ");
        float r = intst.nextFloat();
        System.out.println("Enter T ");
        float t = intst.nextFloat();
        float si = ( p * r * t );
        System.out.println("Simple interest is = " + si);

    }
}
