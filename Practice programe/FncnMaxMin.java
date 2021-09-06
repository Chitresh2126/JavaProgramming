import java.util.Scanner;

public class FncnMaxMin {
    static int max(int a , int b, int c){
        if(a > b && a > c){
            return a;
        }
        else {
            if(b > a && b > c){
                return b;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number ");
        int max , min;
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int maxans = max(a ,b , c);
        int minans = min(a , b, c);
        System.out.println("Maximum number is " + maxans);
        System.out.println("Minimum number is " + minans);
    }

    static int min(int a, int b, int c) {
        if(a < b && a < c){
            return a;
        }
        else {
            if(b < a && b < c){
                return b;
            }
        }
        return c;
    }
}
