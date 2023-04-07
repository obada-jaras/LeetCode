class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length <= 1 || k == 0 || k % nums.length == 0) return;
        if (k > nums.length) k %= nums.length;
        
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        
        for (int i = 0; i < k; i++) {
            nums[i] = temp[nums.length-k+i];
        }
        
        for (int i = k; i < nums.length; i++) {
            nums[i] = temp[i-k];
        }
    }
}