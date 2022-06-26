class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int start = 0;
        int end = nums.length-1;
        int pointer = nums.length-1;
            
        while (start <= end) {
            if (Math.abs(nums[start]) > Math.abs(nums[end])){
                result[pointer] = nums[start] * nums[start];
                start++;
            }
            else {
                result[pointer] = nums[end] * nums[end];
                end--;
            }
            
            pointer--;
        }
        
        return result;
    }
}