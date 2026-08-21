class Solution {
    boolean checkRows(char[][] board)
    {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i++)
        {
            Set<Character> st=new HashSet<>();
            for(int j=0;j<m;j++)
            {
                char c=board[i][j];
                if(c!='.')
                {
                    if(st.contains(c)) return false;
                    st.add(c);
                }
            }
        }
        return true;
    }
    boolean checkCols(char[][] board)
    {
        int n=board.length,m=board[0].length;
        for(int j=0;j<m;j++)
        {
            Set<Character> st=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                char c=board[i][j];
                if(c!='.')
                {
                    if(st.contains(c)) return false;
                    st.add(c);
                }
            }
        }
        return true;
    }
    boolean checkBox(char[][] board,int row,int col)
    {
        Set<Character> st=new HashSet<>();
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
               char c=board[i][j];
                if(c!='.')
                {
                    if(st.contains(c)) return false;
                    st.add(c);
                } 
            }
        }
        return true;
    }
    boolean checkBoxs(char[][] board)
    {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i=i+3)
        {
            Set<Character> st=new HashSet<>();
            for(int j=0;j<m;j=j+3)
            {
                if(!checkBox(board,i,j)) return false;
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        return checkRows(board) && checkCols(board) && checkBoxs(board);
    }
}
