import java.util.Scanner;

public class Symbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        char item = scanner.next().charAt(0);
        if( item == '+') {
            System.out.println("The sum is " + ( number1 + number2 ));
        }
        else if ( item == '-'){
            System.out.println("The subtraction is " + ( number1 - number2 ));
        }
        else if ( item == '*'){
            System.out.println("The multiplication is " + ( number1 * number2 ));
        }
        else if ( item == '/'){
            System.out.println("The division is " + ( number1 / number2));
        }


    }
}
