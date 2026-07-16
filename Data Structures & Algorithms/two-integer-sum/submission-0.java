class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0,j = nums.length - 1, sum = 0;

        while (i < j) {
            sum = nums[i] + nums[j];
            if (sum == target)
                break; 
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[]{i, j};
    }
}
