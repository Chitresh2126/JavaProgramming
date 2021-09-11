public class Pattern26 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1 ; i <= 6; i++){
            k++;
            for (int j = 1; j <= 6 ;j++){
                if (j <= 7 - i){
                    System.out.print(k + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
