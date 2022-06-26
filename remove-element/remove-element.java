class Solution {
    public int removeElement(int[] nums, int val) {
        
        int start = 0, end = nums.length-1;
        int length = nums.length;
        
        while (start <= end) {
            if (nums[start] == val) {
                if (nums[end] != val) {
                    nums[start] = nums[end];
                    
                }
                
                length--;
                end--;
                continue;                    
            }
            start++;
        }
        
        return length;
    }
}