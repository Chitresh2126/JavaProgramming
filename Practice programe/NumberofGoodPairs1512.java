import java.util.Scanner;

public class NumberofGoodPairs1512 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nums = new int[6];
        for (int i = 0;i<nums.length;i++){
            nums[i] = scanner.nextInt();
        }
        int ans = checkingPair(nums);
        System.out.println(ans);
    }

    private static int checkingPair(int[] nums) {
        int count = 0;
        for (int i = 0 ; i<nums.length ;i++){
            for (int j = 1+i; j<nums.length;j++){
                if (nums[i]==nums[j]&&i<j){
                    count++;
                }
            }
        }
        return count;
    }
}
