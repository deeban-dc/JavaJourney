//https://leetcode.com/problems/richest-customer-wealth/

//   Input: accounts = [[1,2,3],[3,2,1]]
//        Output: 6
//        Explanation:
//        1st customer has wealth = 1 + 2 + 3 = 6
//        2nd customer has wealth = 3 + 2 + 1 = 6
//        Both customers are considered the richest with a wealth of 6 each, so return 6.

public class Leetcode_richest_customer_wealth {
    public static void main(String[] args) {
        
    }


    public int maximumWealth(int[][] accounts) {
        //row = person    col = account
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum = sum + accounts[person][account];
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}
