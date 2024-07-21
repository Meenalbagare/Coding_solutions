class Solution {
    // public static void 
    public boolean isSafe(char[][] board,int r,int c,char d){
        //col
        for(int i=0;i<=8;i++){
            if(board[i][c]==d){
                return false;
            }
        }
        //row
        for(int j=0;j<=8;j++){
            if(board[r][j]==d){
                return false;
            }
        }
        //grid
        int sr=(r/3)*3;
        int sc=(c/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(board[i][j]==d){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean sudoku(char[][] board,int r,int c){
        if(r==9){
            return true;
        }
        int nr=r,nc=c+1;
        if(c+1==9){
            nr=r+1;
            nc=0;
        }
        if(board[r][c]!='.'){
            return sudoku(board,nr,nc);
        }
        for(char d='1';d<='9';d++){
            if (isSafe(board,r,c,d)){
                board[r][c]=d;
                if(sudoku(board,nr,nc)){
                    return true;
                }
                board[r][c]='.';
            }
        }
        return false;
    }
    public void solveSudoku(char[][] board) {
        // if(sudoku(board,0,0)){
        //     printSudoku(board);
        // }
        sudoku(board,0,0);
    }
    
}
    