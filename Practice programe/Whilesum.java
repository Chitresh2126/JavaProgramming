import java.util.Scanner;

public class Whilesum {
    public static void main(String[] args) {
        Scanner digit =  new Scanner(System.in);
        System.out.println("This code is continuing summing till ypu press 0 to stop the code: ");
        float sum =0;
        while(true)
        {
            float num = digit.nextFloat();
            if( num == 0 )
            {
                break;
            }
            else {
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
