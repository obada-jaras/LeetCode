class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countHash = new HashMap<>();
        List<Integer>[] freqArray = new List[nums.length+1];
        
        for (int i = 0; i < nums.length; i++) {
            countHash.put(nums[i], countHash.getOrDefault(nums[i], 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : countHash.entrySet()) {
            int frequency = entry.getValue();
            
            if (freqArray[frequency] == null) {
                freqArray[frequency] = new ArrayList<>();
            }
            freqArray[frequency].add(entry.getKey());
        }
        
        int[] ans = new int[k];
        for (int i = freqArray.length-1, pAns = 0; i >= 0 && pAns < k; i--) {
            if (freqArray[i] != null) {
                for (int j = 0; j < freqArray[i].size() && pAns < k; j++) {
                    ans[pAns] = freqArray[i].get(j);
                    pAns++;
                }
            }
        }
             
             return ans;
    }
}