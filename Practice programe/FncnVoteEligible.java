import java.util.Scanner;

public class FncnVoteEligible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a age of a candidate ");
        int n = scanner.nextInt();
        boolean elig = find(n);
        if(elig == true) {
            System.out.println("Yes candidate is eligible for giving vote");
        }
        else {
            System.out.println("No candidate is not eligible for giving vote");
        }
    }

    private static boolean find(int n) {
        if(n >= 18){
            return true;
        }
        return false;
    }
}
