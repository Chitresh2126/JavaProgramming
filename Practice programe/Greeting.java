import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner member = new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name = member.next();
        System.out.println( name + "\r\n Happy birthday. On your special day,\r\nI wish you great luck. I hope that \r\nthis wonderful day will fill your heart with joy \r\nand blessings. Have a wond..");
    }
}
