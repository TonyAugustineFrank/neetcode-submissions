class Solution {
    public boolean isValidSudoku(char[][] board) {
    
        int row[] = new int[9];
        int col[] = new int[9];
        int square[] = new int[9];
        for (int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                if(board[i][j]=='.')continue;

                int val = board[i][j]-'1';
                int mask = 1<<val;

                if((row[i]&mask)>0)return false;
                if((col[j]&mask)>0)return false;
                if((square[((i/3)*3) + (j/3)]&mask)>0)return false;

                row[i]|=mask;
                col[j]|=mask;
                square[((i/3)*3) + (j/3)]|=mask;

            }
        }
        return true;
    }
}