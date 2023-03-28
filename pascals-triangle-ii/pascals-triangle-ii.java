class Solution {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) return List.of(1);
     
        List<Integer> prevLevel = getRow(rowIndex-1);
        List<Integer> currLevel = new ArrayList<>();
        
        currLevel.add(1);
        for (int i = 0; i < prevLevel.size()-1; i++) {
            currLevel.add(prevLevel.get(i) + prevLevel.get(i+1));
        }
        currLevel.add(1);
        
        return currLevel;
    }
}