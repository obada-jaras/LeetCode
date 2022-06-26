class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) return 0;
        
        int rows = grid.length;
        int columns = grid[0].length;
        int numberOfIslands = 0;
        
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Queue<int[]> q = new LinkedList();
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++){
                
                if (grid[i][j] == '1') {
                    grid[i][j] = '2';
                    
                    q.add(new int[] {i, j});
                    numberOfIslands++;
                    
                    while (!q.isEmpty()) {
                        int[] coordinates = q.poll();
                        
                        for (int[] dir: directions) {
                            int r = coordinates[0] + dir[0];
                            int c = coordinates[1] + dir[1];
                            
                            if (r >= 0 && r < rows && c >= 0 && c < columns && grid[r][c] == '1') {
                                q.add(new int[] {r, c});
                                grid[r][c] = '2';
                            }
                        }
                    }
                }
            }
        }
        
        return numberOfIslands;
    }
}