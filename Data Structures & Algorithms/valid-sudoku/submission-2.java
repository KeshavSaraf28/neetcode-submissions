class Solution {
    boolean checkSet(Set<Character> st,Character c)
    {
        if(c!='.'){
            if(st.contains(c)) return false;
            st.add(c);
        }
        return true;
    }
    boolean checkRows(char[][] board)
    {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i++)
        {
            Set<Character> st=new HashSet<>();
            for(int j=0;j<m;j++)
            {
                if(!checkSet(st,board[i][j])) return false;
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
                if(!checkSet(st,board[i][j])) return false;
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
               if(!checkSet(st,board[i][j])) return false; 
            }
        }
        return true;
    }
    boolean checkBoxs(char[][] board)
    {
        int n=board.length,m=board[0].length;
        for(int i=0;i<n;i=i+3)
        {
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
