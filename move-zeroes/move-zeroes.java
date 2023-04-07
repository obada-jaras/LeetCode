class Solution {
    public void moveZeroes(int[] nums) {
        int p1 = 0, p2 = 0;
        while (p1 < nums.length) {
            if (nums[p1] != 0) {
                nums[p2] = nums[p1];
                p2++;
            }
            p1++;
        }
        
        while (p2 < nums.length) {
            nums[p2] = 0;
            p2++;
        }
    }
}