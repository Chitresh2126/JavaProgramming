import java.util.Scanner;

public class FncnGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a marks ");
        int n = scanner.nextInt();
        int marks = fancy(n);
    }

    private static int fancy(int n) {
        if(100 >= n && n >= 91){
            System.out.println("AA");
        }
        else if(90 >= n && n >= 81)
        {
            System.out.println("AB");
        }
        else if(80 >= n && n >= 71){
            System.out.println("BB");
        }
        else if(70 >= n && n >= 61){
            System.out.println("BC");
        }
        else if(60 >= n && n >= 51){
            System.out.println("CD");
        }
        else if(50 >= n && n >= 41){
            System.out.println("DD");
        }
        else if(40 >= n ){
            System.out.println("FAIL");
        }
        return 0;

    }
}



