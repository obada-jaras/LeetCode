class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board[i])) return false;            
        }
        
        if(!areColumnsValid(board)) return false;
        
        return are9BoxesValid(board);
    }
    
    
    private boolean isValidRow(char[] row) {
        boolean[] used = new boolean[9];
        
        for (int i = 0; i < 9; i++) {
            if (row[i] != '.') {
                if (used[row[i] - '1']) return false;
                used[row[i] - '1'] = true;
            }
        }
        
        return true;
    }
    
    private boolean areColumnsValid(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] used = new boolean[9];

            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (used[board[j][i] - '1']) return false;
                    used[board[j][i] - '1'] = true;
                } 
            }
        }
        
        return true;
    }
    
    private boolean are9BoxesValid(char[][] board) {
        int[][] positions = {{0,2,0,2}, {0,2,3,5}, {0,2,6,8},
                             {3,5,0,2}, {3,5,3,5}, {3,5,6,8},
                             {6,8,0,2}, {6,8,3,5}, {6,8,6,8}};
        
        for (int i = 0; i < positions.length; i++) {
            int[] po = positions[i];
            boolean[] used = new boolean[9];
            
            for (int j = po[0]; j <= po[1]; j++) {
                for (int k = po[2]; k <= po[3]; k++) {
                    if (board[j][k] != '.') {
                        if (used[board[j][k] - '1']) return false;
                        used[board[j][k] - '1'] = true;
                    } 
                }
            }
        }
        
        
        return true;
    }
}