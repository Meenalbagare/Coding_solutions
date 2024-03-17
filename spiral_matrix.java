SPIRAL MATRIX

public class spiral{
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        spiralmatrix(matrix);
    }

    public static void spiralmatrix(int matrix[][]) {
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix[0].length-1;

        while(startRow<=endRow && startCol <= endRow) {
            //top
            for (int j=0;j<=endCol;j++) {
                System.out.println(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++) {
                System.out.println(matrix[i][endCol]);
            }
            //botton
            for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    return;
                }
                System.out.println(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endCol){
                    return;
                }
                System.out.println(matrix[i][startCol]);
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
        System.out.println();
    } 
}
