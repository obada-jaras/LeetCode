class Solution {
    public int heightChecker(int[] heights) {
        int counter = 0;
        int[] sorted = heights.clone();
        Arrays.sort(sorted);
                    
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sorted[i]) counter++;
        }
        
        return counter;
    }
}