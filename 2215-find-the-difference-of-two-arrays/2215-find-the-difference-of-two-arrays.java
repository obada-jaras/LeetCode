class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        for (Integer num : nums1) {
            set1.add(num);
        }
        
        HashSet<Integer> set2 = new HashSet<>();
        for (Integer num : nums2) {
            set2.add(num);
        }
        
        
        HashSet<Integer> list1 = new HashSet<>();
        for (Integer num : nums1) {
            if (!set2.contains(num)) list1.add(num);
        }
        
        HashSet<Integer> list2 = new HashSet<>();
        for (Integer num : nums2) {
            if (!set1.contains(num)) list2.add(num);
        }
        
        
        List<List<Integer>> answer = new ArrayList<>();
        answer.add(new ArrayList(list1));
        answer.add(new ArrayList(list2));
        return answer;
    }
}