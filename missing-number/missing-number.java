class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size * (size+1) / 2;
        
        for (int i = 0; i < size; i++) {
            sum -= nums[i];
        }
        
        return sum;
    }
}