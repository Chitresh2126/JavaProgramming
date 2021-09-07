/*
  Problem link:
  https://leetcode.com/problems/richest-customer-wealth/
 */
public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        System.out.println(maximumWealth(new int[][]{{1,2,3},{1, 2, 3}}));
    }



    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row:accounts){
            int curr = 0;
            for(int num: row){
                curr = curr + num;
            }
            max = Math.max(curr, max);
        }
        return max;
    }
}

