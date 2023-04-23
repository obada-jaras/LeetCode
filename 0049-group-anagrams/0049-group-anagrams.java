class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hash = new HashMap<>();
        
        for (int i = 0; i < strs.length; i++) {
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            
            String str = String.valueOf(chars);
            if (hash.containsKey(str)) hash.get(str).add(strs[i]);
            else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                hash.put(str, list);
            }
        }
        
        return new ArrayList<>(hash.values());
    }
}