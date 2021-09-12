//Pattern 10
//               *
//              * *
//             * * *
//            * * * *
//           * * * * *


public class Pattern10 {
    public static void main(String[] args) {
        boolean k;
        for (int i = 1; i <= 5; i++){
            int m =1;
            k = true;
            for (int j = 1; j <=9; j++){

                if (j >= (6-i) && j <= (4+i) && k){

                        System.out.print(m);

                        k = false;

                }
                else {
                    int i1 = (j < 5) ? m++ : m--;

                    System.out.print(" ");
                    k = true;
                }
            }
            System.out.println();
        }
    }
}
