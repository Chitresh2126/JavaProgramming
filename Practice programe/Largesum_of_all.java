import java.util.Scanner;

public class Largesum_of_all {
    public static void main(String[] args) {
        Scanner items = new Scanner(System.in);
        int value = 0 ;
        while(true){
            int number = items.nextInt();
            if( number == 0 ){
                break;
            }
            else
            {
                if ( number > value)
                {
                    value = number;
                }
                else {
                    value = value;
                }
            }
        }
        System.out.println("Largest number is " + value);

    }
}
