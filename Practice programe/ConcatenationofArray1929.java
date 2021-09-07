// Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
// Specifically, ans is the concatenation of two nums arrays.
// Return the array ans.
// Example 1:
//
// Input: nums = [1,2,1]
// Output: [1,2,1,1,2,1]
// Explanation: The array ans is formed as follows:
// - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
// - ans = [1,2,1,1,2,1]


import java.util.Arrays;

public class ConcatenationofArray1929 {
    public static void main(String[] args) {
        int[] ans = getConcatenation(new int[]{1 ,2 ,3});
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] ints) {
        int[] ans = new int[2 * ints.length];
        for (int i = 0; i < 2 * ints.length ; i++){
            if(i < ints.length){
                ans[i] = ints[i];
            }
            else{
                ans[i] = ints[i - ints.length];
            }
        }
        return ans;
    }
}
