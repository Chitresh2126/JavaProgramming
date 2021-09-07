/*
https://leetcode.com/problems/shuffle-the-array/
*/


import java.util.Arrays;

public class ShuffletheArray1470 {
    public static void main(String[] args) {
        int[] ans = shuffle(new int[]{2,5,1,3,4,7},3);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2*n];

        for(int i=0,j=0; i<nums.length;j++){
            ans[i] = nums[j];
            ans[i+1] = nums[j+n];
            i=i+2;
        }
        return ans;

    }
}
