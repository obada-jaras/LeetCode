class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int sum = size * (size+1) / 2;
        boolean isZero = true;
        
        for (int i = 0; i < size; i++) {
            int num = nums[i];
            
            if (num == 0)
                isZero = false;
            
            sum -= num;
        }
        
        if (isZero) return 0;
        return sum;
    }
}