class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> countHash = new HashMap<>();
        List<Integer>[] freqArray = new List[nums.length + 1];

        // Count the occurrences of each element in nums
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            countHash.put(num, countHash.getOrDefault(num, 0) + 1);
        }

        // Create frequency array (buckets) based on element occurrences
        for (Integer key : countHash.keySet()) {
            int frequency = countHash.get(key);

            if (freqArray[frequency] == null) {
                freqArray[frequency] = new ArrayList<>();
            }
            freqArray[frequency].add(key);
        }

        int[] ans = new int[k];
        int ansIndex = 0;

        // Iterate through the frequency array in reverse order
        for (int i = freqArray.length - 1; i >= 0 && ansIndex < k; i--) {
            List<Integer> currentBucket = freqArray[i];

            if (currentBucket != null) {
                // Iterate through the elements in the current bucket
                for (int j = 0; j < currentBucket.size() && ansIndex < k; j++) {
                    ans[ansIndex] = currentBucket.get(j);
                    ansIndex++;
                }
            }
        }

        return ans;
    }
}
