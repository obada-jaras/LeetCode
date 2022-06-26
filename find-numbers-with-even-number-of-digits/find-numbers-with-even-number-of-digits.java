class Solution {
    public int findNumbers(int[] nums) {
        int result = 0;
        
        for (int i = 0; i < nums.length; i++){
            
            int numberOfDigits = 0;
            int temp = nums[i];
            while (temp > 0){
                numberOfDigits++;
                temp /= 10;
            }
            
            if (numberOfDigits % 2 == 0) result++;
            
        }
        
        return result;
    }
}