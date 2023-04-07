class Solution {
    public int singleNumber(int[] nums) {
        int answer = 0;
        
        for (Integer i : nums) {
            answer ^= i;
        }
        
        return answer;
    }
}