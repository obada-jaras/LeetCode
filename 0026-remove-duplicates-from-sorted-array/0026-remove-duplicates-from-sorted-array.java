class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;
        
        int p1 = 0, p2 = 1, count = 1;
        
        while (p2 < nums.length) {
            if (nums[p1] != nums[p2]) {
                nums[count] = nums[p2];
                count++;
                p1 = p2;
            }
            p2++;
        }
        
        return count;
    }
}