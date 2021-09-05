import java.util.Scanner;

public class Kunal26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = 31;
       int count = 0;
        System.out.println("August ");
       while (num > 0){
           if (num % 2 == 0){
               System.out.println(  num);
                count++;
           }
           num--;
       }
        System.out.println("These days are where you have permit to go outside " + count);

    }
}
