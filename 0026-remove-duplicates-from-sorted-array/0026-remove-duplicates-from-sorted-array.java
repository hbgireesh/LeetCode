class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 0;
        for (int point = 1; point<nums.length; point++) {
            if (nums[unique] != nums[point]){
                unique++;
                nums[unique] = nums[point];
            }
        }
        return unique+1;
    }
}