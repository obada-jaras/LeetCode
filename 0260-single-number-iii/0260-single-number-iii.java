class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();

        for (Integer num : nums) {
            hash.put(num, hash.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[2];
        int count = 0;
        for (Integer num : nums) {
            if (hash.get(num) == 1) {
                ans[count] = num;
                count++;
            }

            if (count == 2) return ans;
        }

        return ans;
    }
}