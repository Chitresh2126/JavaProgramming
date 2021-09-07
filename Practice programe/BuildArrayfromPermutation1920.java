//Given a zero-based permutation nums (0-indexed), build an array ans of the same
// length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.

 // A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).



import java.util.Arrays;

public class BuildArrayfromPermutation1920 {
    public static void main(String[] args) {
        int[] ans = buildArray(new int[]{1 ,2 ,3 ,4 ,5});
        System.out.println(Arrays.toString(ans));
    }

    private static int[] buildArray(int[] ints) {
        int[] ans = new int[ints.length];
        for (int i = 0; i < ints.length ; i++){
            ans[i] = ints[ints[i]];

        }
        return ans;
    }
}
