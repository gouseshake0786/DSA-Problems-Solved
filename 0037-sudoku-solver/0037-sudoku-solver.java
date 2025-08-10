class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    boolean solve(char[][] board){
        int n = board.length;
        int row = -1;
        int col = -1;
        boolean isemptyLeft = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                if(board[i][j] == '.'){
                    row = i;
                    col = j;
                    isemptyLeft = false;
                    break;
                }
            }
            if(isemptyLeft == false){
                break;
            }
        }
        if(isemptyLeft){
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if(isSafe(board,row,col,number)){
                board[row][col] = (char)(number + '0');
                if(solve(board)){
                    return true;
                }
                else {
                    board[row][col] = '.';
                }
            }
        }
        return false;
    }

    boolean isSafe(char[][] board, int row, int col, int num){
        for (int i = 0; i < board.length ; i++) {
            if(board[row][i] == (char)(num + '0')){
                return false;
            }
        }

        for (char[] nums : board) {
            if(nums[col] == (char)(num + '0')){
                return false;
            }
        }

        int sqrt = (int)(Math.sqrt(board.length));
        int rowStart = row - row%sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {
                if(board[r][c] == (char)(num + '0')){
                    return false;
                }
            }

        }
        return true;
    }
}