class Solution {
    int count = 0;
    int[] nums;
    int target;
    public int findTargetSumWays(int[] nums, int target) {
        this.target = target;
        this.nums = nums;

        dfs(0, 0);
        
        return count;
    }

    private void dfs(int index, int sum) {
        if (index == nums.length) {
            if (sum == target) count++;
            return;
        }

        dfs(index + 1, sum + nums[index]);
        dfs(index + 1, sum - nums[index]);
    }
}