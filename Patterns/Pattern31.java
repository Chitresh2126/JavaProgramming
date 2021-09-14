//Pattern 31

//        4 4 4 4 4 4 4
//        4 3 3 3 3 3 4
//        4 3 2 2 2 3 4
//        4 3 2 1 2 3 4
//        4 3 2 2 2 3 4
//        4 3 3 3 3 3 4
//        4 4 4 4 4 4 4

public class Pattern31 {
    public static void main(String[] args) {
        Pattern(4);
    }

    private static void Pattern(int n) {
        int originalN = n;
        n = 2*n;
        for (int row = 1;row<n;row++){
            for (int col = 1; col<n;col++){
                int  valueOfIndex = originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col))+1;
                System.out.print(valueOfIndex + " ");
            }
            System.out.println();
        }
    }
}
