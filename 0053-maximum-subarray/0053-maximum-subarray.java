class Solution {
    public int maxSubArray(int[] nums) {
        //Kadens algorithm
        int left = 0, right = nums.length, sum = 0,max = Integer.MIN_VALUE;
        while (left < right){
            sum += nums[left];
            max = Math.max(sum,max);
            if(sum < 0){
                sum = 0;
            }
            left++;
        }
        return max;
    }
}