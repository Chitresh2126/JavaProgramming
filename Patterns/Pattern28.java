//Pattern 28


//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *

public class Pattern28 {
    public static void main(String[] args) {
        boolean k;
        int t = 0;
        for (int i = 1; i <= 10; i++){

            k = true;
            if (i <=5){
                t++;
            }
            else if (i > 6){
                t--;
            }
            for (int j = 1; j <=9; j++){
                if (j >= (6-t) && j <= (4+t) && k){

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
