import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int view = scanner.nextInt();
        for (int count = 1 ; count <= view ; count++)
        {
            if ( view % count == 0)
            {
                System.out.println(count);
            }
        }
    }
}
