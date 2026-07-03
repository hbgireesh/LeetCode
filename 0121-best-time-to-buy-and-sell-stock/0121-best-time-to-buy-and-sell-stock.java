class Solution {
    public int maxProfit(int[] prices) {
        int minVal = Integer.MAX_VALUE;
        int maxDif = 0;

        for (int price : prices) {
            minVal = Math.min(minVal, price);
            maxDif = Math.max(maxDif, price - minVal);
        }
        
        return maxDif;
    }
}