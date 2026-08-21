class NumMatrix {
    int[][] mat;
    public NumMatrix(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        mat=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int up=i>0?mat[i-1][j]:0;
                int left=j>0?mat[i][j-1]:0;
                int diag=i>0&&j>0?mat[i-1][j-1]:0;
                mat[i][j]=matrix[i][j]+up+left-diag;
            }
        }
        
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int leftup=row1>0?mat[row1-1][col2]:0;
        int leftleft=col1>0?mat[row2][col1-1]:0;
        int leftdiag=col1>0&&row1>0?mat[row1-1][col1-1]:0;
        return mat[row2][col2]-leftup-leftleft+leftdiag;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */