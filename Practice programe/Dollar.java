import java.util.Scanner;

public class Dollar {
    public static void main(String[] args) {
        Scanner currency = new Scanner(System.in);
        System.out.println("Enter price in Rupee");
        float rs = currency.nextFloat();
        float dev = ( rs / 72 ) ;
        float rem = ( rs % 72 ) ;
        float doll = dev + rem ;
        System.out.println("Converting Rupees into Dollar = " + doll );
    }
}
