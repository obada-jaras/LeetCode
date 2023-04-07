class Solution {
    int[] nums;
    
    public void rotate(int[] nums, int k) {
        this.nums = nums;
        k %= nums.length;
        
        reverse(0, nums.length-1);
        reverse(0, k-1);
        reverse(k, nums.length-1);
    }
    
    private void reverse(int lo, int hi) {
        while (lo < hi) {
            swap(lo, hi);
            lo++;
            hi--;
        }
    }
    
    private void swap(int p1, int p2) {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}