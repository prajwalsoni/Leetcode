class Solution {
    public boolean isValidSudoku(char[][] board)
     {
         for(int i=0; i<9; i++)
        {
            for(int j=0; j<9; j++)
            {
                if(!isValid(i,j,board))
                {
                    return false;
                }
            }
        }
      return true;
    }

    private boolean isValid(int row, int col, char[][] board) {
    char current = board[row][col];
    if (current == '.') return true; // Empty cell is always valid

    // Check row and column
    for (int i = 0; i < 9; i++) {
        if (i != col && board[row][i] == current) return false; // Check row
        if (i != row && board[i][col] == current) return false; // Check column
    }

    // Check subgrid (3x3)
    int subgridRowStart = (row / 3) * 3;
    int subgridColStart = (col / 3) * 3;
    for (int i = subgridRowStart; i < subgridRowStart + 3; i++) {
        for (int j = subgridColStart; j < subgridColStart + 3; j++) {
            if (i != row && j != col && board[i][j] == current) return false; // Check subgrid
        }
    }

    return true; // If no violations found, the current cell is valid
}

}