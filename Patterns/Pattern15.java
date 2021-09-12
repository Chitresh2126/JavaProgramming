//Pattern 15

//            *
//           * *
//          *   *
//         *     *
//        *       *
//         *     *
//          *   *
//           * *
//            *

public class Pattern15 {
    public static void main(String[] args) {
        int k = 0;
        for (int i =1 ;i<=9 ;i++){
//            int m;
//            if (i<5){
//                m = i;
//            }else {
//                m= i-2;
//            }

            int i2 = (i < 6) ? k++ : k--;
            for (int j =1 ;j<=9 ;j++){
                if (j==6-k || j==4+k){
                    System.out.print("*");
//                    int i1 = (j < 4) ? m-- : m++;
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
