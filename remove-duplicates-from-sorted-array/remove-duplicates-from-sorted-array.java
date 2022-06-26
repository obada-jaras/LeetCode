class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        
        
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[length] = nums[i];
                length++;
            }
        }
        
        nums[length] = nums[nums.length-1];
        return length+1;
    }
}