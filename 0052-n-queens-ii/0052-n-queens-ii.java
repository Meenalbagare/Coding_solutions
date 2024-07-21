class Solution {
    static int count=0;
    public int totalNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        count=0;
        nQueens(board,0,n);
        return count;
    }
    public static boolean isSafe(char board[][],int row,int col,int n){
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
        for(int i=row-1,j=col+1;i>=0 && j<n;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    // public static void printBoard(char board[][]){
    //     System.out.println("--------------");
    //     for(int i=0;i<board.length;i++){
    //         for(int j=0;j<board.length;j++){
    //             System.out.print(board[i][j]+" ");
    //         }
    //     }
    //     System.out.println();
    // }
    public static void nQueens(char board[][], int row,int n){
        if(row==n){
            count++;
            // printBoard(board);
            return;
        }
        for(int j=0;j<n;j++){
            if (isSafe(board,row,j,n)){
                board[row][j]='Q';
                nQueens(board,row+1,n);
                board[row][j]='.';
            }
        }
        
    }
   
    
}