//Pattern 5

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *

public class Pattern5 {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 1; i<=10; i++){

//            k++;
            if (i<=5){
                k++;
            }
            else {
                if (i >6){
                    k--;
                }
            }

            for (int j=1; j<=5; j++){
                if (j<=k){
                    System.out.print("*" + " ");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
