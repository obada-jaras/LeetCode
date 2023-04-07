class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for (Integer i : nums) {
            if (!set.add(i)) return true;
        }
        
        return false;
    }
}