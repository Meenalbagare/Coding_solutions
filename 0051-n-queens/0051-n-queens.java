class Solution {
    public static boolean isSafe(char board[][],int row,int col){
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static List<String> printBoard(char board[][]){
        List<String> r=new ArrayList<>();
        for(int i=0;i<board.length;i++){
            String row=new String(board[i]);
            r.add(row);
        }
        return r;
    }
    public static void nQueens(List<List<String>> res,char board[][],int row){
        if(row==board.length){
            res.add(printBoard(board));
            return;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueens(res,board,row+1);
                board[row][j]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<>();
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        nQueens(res,board,0);
        return res;
    }
}