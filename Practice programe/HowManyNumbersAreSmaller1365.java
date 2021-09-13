import java.util.Arrays;
import java.util.Scanner;

public class HowManyNumbersAreSmaller1365 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] nor = new int[5];
        for (int row = 0;row<nor.length;row++){
            nor[row] = scanner.nextInt();
        }
        int[] n= smallerNumbersThanCurrent(nor);
        System.out.println(Arrays.toString(n));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] arr = new int[size];

        for(int i =0; i < size; i++){
            int a=0;
            for(int j =0; j < size; j++){
                if(j==i){
                    continue;
                }
                if(nums[i]>nums[j]){
                    a++;
                }
            }
            arr[i] = a;

        }
        return arr;

    }
}
