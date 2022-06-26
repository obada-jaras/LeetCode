class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 1) {
                temp++;
            }
            
            else {
                max = (temp > max) ? temp : max;
                temp = 0;          
            }
            
            if (i == nums.length-1)
                max = (temp > max) ? temp : max;
        }
        
        return max;
    }
}