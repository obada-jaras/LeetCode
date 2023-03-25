class Solution {
    int initialColor;
    int newColor;
    int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.newColor = color;
        this.initialColor = image[sr][sc];

        if (initialColor == newColor) {
            return image;
        }
        
        fillImage(image, sr, sc);
        return image;
    }

    public void fillImage(int[][] srcImage, int row, int col) {
        if (!isInside(srcImage, row, col) || srcImage[row][col] != initialColor)
            return;

        srcImage[row][col] = newColor;
        for (int[] dir : DIRECTIONS) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];

            fillImage(srcImage, newRow, newCol);
        }
    }

    public boolean isInside(int[][] srcImage, int row, int col) {
        return row >= 0 && col >= 0 && row < srcImage.length && col < srcImage[0].length;
    }
}