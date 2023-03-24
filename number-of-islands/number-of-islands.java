class Solution {
    public int numIslands(char[][] grid) {
        int rowsCount = grid.length;
        int columnsCount = grid[0].length;
        int islandsCount = 0;

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (grid[i][j] == '1') {
                    grid[i][j] = '2';    // mark it as visited

                    queue.add(new int[] {i, j});
                    islandsCount++;

                    while (!queue.isEmpty()) {
                        int[] coordinates = queue.poll();

                        for (int[] dir: directions) {
                            int row = coordinates[0] + dir[0];
                            int col = coordinates[1] + dir[1];

                            if (isInside(row, col, rowsCount, columnsCount)) {
                                if (grid[row][col] == '1') {
                                    queue.add(new int[]{row, col});
                                    grid[row][col] = '2';
                                }
                            }
                        }
                    }
                }
            }
        }

        return islandsCount;
    }

    private boolean isInside(int row, int col, int rowsCount, int columnsCount) {
        return row >= 0 && col >= 0 && row < rowsCount && col < columnsCount;
    }
}