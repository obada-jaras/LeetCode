import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> hash = new Hashtable<>();
        
        for (Integer i : nums) {
            if (!hash.containsKey(i)) hash.put(i, 1);
            else if (hash.get(i) == 1) hash.remove(i);
        }
        
        return (int)hash.keySet().toArray()[0];
    }
}