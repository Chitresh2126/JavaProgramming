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
        pattern28(5);
    }
    //Better approach
    static void pattern28(int n){
        for (int row = 0; row< 2 * n; row++){   //for rows
            int totalColumnsinRow = row>n? 2*n -row: row;  //To find number of column in rows
            int noOfpaces = n - totalColumnsinRow;  //How many space
            for (int s = 0; s<noOfpaces; s++){   //loop for printing space
                System.out.print(" ");
            }
            for (int col = 0; col < totalColumnsinRow; col++){  //loop for printing stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
