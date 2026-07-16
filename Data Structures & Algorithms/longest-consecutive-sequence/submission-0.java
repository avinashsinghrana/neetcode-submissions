class Solution {
    public int longestConsecutive(int[] nums) {
        int res = 0;
        Set<Integer> data = new HashSet<>();
        for (int num : nums) {
            data.add(num);
        }
        for(int n : nums) {
            int streak = 0, cur = n;
            while(data.contains(cur)) {
                streak++;
                cur++;
            }
            res = Math.max(res, streak);
        }
        return res;
    }
}
