class Solution {
    private int rowsCount;
    private int columnsCount;
    private char [][] grid;
    private final int[][] DIRECTIONS = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public int numIslands(char[][] grid) {
        int islandsCount = 0;

        this.grid = grid;
        rowsCount = grid.length;
        columnsCount = grid[0].length;

        for (int i = 0; i < rowsCount; i++) {
            for (int j = 0; j < columnsCount; j++) {
                if (grid[i][j] == '1') {
                    islandsCount++;
                    dfc(i, j);
                }
            }
        }

        return islandsCount;
    }

    private void dfc(int row, int col) {
        if (isInside(row, col) && grid[row][col] == '1') {
            grid[row][col] = '2';

            for (int[] dir : DIRECTIONS) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                dfc(newRow, newCol);
            }
        }
    }

    private boolean isInside(int row, int col) {
        return row >= 0 && col >= 0 && row < rowsCount && col < columnsCount;
    }
}