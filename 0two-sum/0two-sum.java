class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                result[0] = hash.get(nums[i]);
                result[1] = i;
                return result;
            } 
            
            else {
                hash.put(target-nums[i], i);
            }
        }
        
        return result;
    }
}