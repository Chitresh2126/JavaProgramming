public class Pattern11 {
    public static void main(String[] args) {
        boolean k;
        for (int i = 1; i <= 5; i++){
            k = true;
            for (int j = 1; j <=9; j++){
                if (j >= i && j <= 10-i && k){

                    System.out.print("*");
                    k = false;

                }
                else {

                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}
