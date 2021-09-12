public class Pattern17 {
    public static void main(String[] args) {
        int k = 0;
        for (int i =1 ;i<=7 ;i++){
            int m;
            if (i<5){
                m = i;
            }else {
                m= i-2;
            }

            int i2 = (i < 5) ? k++ : k--;
            for (int j =1 ;j<=7 ;j++){
                if (j>=5-k && j<=3+k){
                    System.out.print(m);
                    int i1 = (j < 4) ? m-- : m++;
                }

                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
