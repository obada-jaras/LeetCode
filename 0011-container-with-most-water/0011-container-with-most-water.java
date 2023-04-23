class Solution {
    public int maxArea(int[] height) {
        int leftIndex = 0, rightIndex = height.length - 1;
        int maxArea = 0;

        // Move the left and right indices toward each other
        while (leftIndex < rightIndex) {
            // Calculate the area between the left and right indices
            int minHeight = Math.min(height[leftIndex], height[rightIndex]);
            int width = rightIndex - leftIndex;
            int area = width * minHeight;

            // Update the maximum area if the current area is larger
            maxArea = Math.max(maxArea, area);

            // Move the index with the shorter height towards the center
            if (height[leftIndex] < height[rightIndex]) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return maxArea;
    }
}
