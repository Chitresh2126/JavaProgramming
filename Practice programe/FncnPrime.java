import java.util.Scanner;

public class FncnPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter start and end number ");
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        int check = pme(n, p);
        System.out.println(check);
    }

    static int pme(int n, int p) {
        int count = 0;
        while (n < p){
            boolean flag = false;
            for (int i = 2; i <= n / 2; i++){
                if(n % 2 == 0){
                    flag = true;
                    break;
                }
            }
            if (!flag && n !=0 && n !=1){
                count++;
                System.out.println(n);
            }
            n++;
        }
        return count;
    }


}