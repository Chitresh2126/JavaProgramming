// Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
// Return the running sum of nums.
// Example 1:
//
// Input: nums = [1,2,3,4]
// Output: [1,3,6,10]
// Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].



//SOLUTION
//       1 Define an array result.
//       2 Initialize the first element of result with the first element of the input array.
//       3 At index i append the sum of the element nums[i] and previous running sum result[i - 1] to the result array.
//       4 We repeat step 3 for all indices from 1 to n-1.


//class Solution {
//    public int[] runningSum(int[] nums) {
//        int[] result = new int[nums.length];
//
//        // Initialize first element of result array with first element in nums.
//        result[0] = nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            // Result at index `i` is sum of result at `i-1` and element at `i`.
//            result[i] = result[i - 1] + nums[i];
//        }
//        return result;
//    }

import java.util.Arrays;

public class RunningSumof1dArray1480 {
    public static void main(String[] args) {
        int[] ans = runningSum(new int[]{1,2,3,4});
        System.out.println(Arrays.toString(ans));

    }
    public static int[] runningSum(int[] nums) {
        int[] runningSums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j <= i; j++) {
                sum += nums[j];
            }
            runningSums[i] = sum;
        }
        return runningSums;
    }
}