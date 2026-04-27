class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++)
        {
            int []row = new int[9];
            
            for(int j=0;j<9;j++)
            {
                char ch = board[i][j];
                if(ch=='.')
                    continue;
                
                int num = ch-'1' ;
                if(row[num]!=0)
                {
                    System.out.println(i+" "+j);
                    return false;
                }
                row[num]=1;
            }
            int []col = new int[9];
            for(int j=0;j<9;j++)
            {
                char ch = board[j][i];
                if(ch=='.')
                    continue;
                
                int num = ch-'1' ;
                if(col[num]!=0)
                {
                    System.out.println(i+" "+j);
                    return false;
                }
                col[num]=1;
            }
            int block[] = new int[9];
            for(int j=(i/3)*3;j<(i/3)*3+3;j++)
            {
                for(int k=(i%3)*3;k<(i%3)*3+3;k++)
                {
                    char ch = board[j][k];
                    if(ch=='.')
                        continue;
                
                    int num = ch-'1' ;
                    if(block[num]!=0)
                    {
                        System.out.println(i+" "+j+" "+k);
                        return false;
                    }
                    block[num]=1;
                }
            }
        }
        return true;
    }
}
