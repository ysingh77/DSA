class Solution {

    public int maximumWealth(int[][] accounts) {
        int maximumWealth = 0;
        for (int cust = 0; cust < accounts.length; cust++) {
            int sum = 0;
            for (int wealth = 0; wealth < accounts[cust].length; wealth++) {
                sum = sum + accounts[cust][wealth];
            }
            maximumWealth = Math.max(maximumWealth, sum);
        }
        return maximumWealth;
    }
}
