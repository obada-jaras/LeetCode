class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 0;
        
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]) {
                nums[size] = nums[i];
                size++;
            }
        }
        
        nums[size] = nums[nums.length-1];
        return size+1;
    }
}