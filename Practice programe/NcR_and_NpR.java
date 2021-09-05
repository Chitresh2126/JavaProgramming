import java.util.Scanner;

public class NcR_and_NpR {
    static int nCr(int n, int r)
    {
        return facto(n) / (facto(r) *
                facto(n - r));
    }
    static int facto(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
    static int fact(int n)
    {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }
    static int nPr(int n, int r)
    {
        return fact(n) / fact(n - r);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = scanner.nextInt();
        System.out.println("Enter the value of r ");
        int r = scanner.nextInt();
        System.out.println( n + "P" + r + " = " + nPr( n , r));
        System.out.println( n + "C" + r + " = " + nCr( n , r));
    }


}
