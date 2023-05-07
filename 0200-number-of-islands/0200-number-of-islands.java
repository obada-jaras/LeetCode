class Solution {
    public int numIslands(char[][] grid) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        int numberOfIslands = 0;

        // Define all four directions: up, down, left, right
        int[][] directions = {{0, -1}, {0, 1}, {-1, 0}, {1, 0}};
        Queue<int[]> queue = new LinkedList<>();

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {
                // If we find land ('1'), perform a BFS to find the whole island
                if (grid[row][col] == '1') {
                    grid[row][col] = '2'; // Mark as visited
                    queue.add(new int[]{row, col});
                    numberOfIslands++;

                    while (!queue.isEmpty()) {
                        int[] currentCoords = queue.poll();

                        // Explore all four directions from the current cell
                        for (int[] dir : directions) {
                            int newRow = currentCoords[0] + dir[0];
                            int newCol = currentCoords[1] + dir[1];

                            if (isInside(newRow, newCol, rowCount, colCount) && grid[newRow][newCol] == '1') {
                                queue.add(new int[]{newRow, newCol});
                                grid[newRow][newCol] = '2'; // Mark as visited
                            }
                        }
                    }
                }
            }
        }

        return numberOfIslands;
    }

    // Helper function to check if a given cell is inside the grid
    private boolean isInside(int row, int col, int rowCount, int colCount) {
        return (row >= 0 && row < rowCount && col >= 0 && col < colCount);
    }
}
