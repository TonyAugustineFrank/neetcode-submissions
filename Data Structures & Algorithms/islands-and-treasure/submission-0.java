class Solution {
    public void islandsAndTreasure(int[][] grid) {

        int length = grid.length;
        int height = grid[0].length;

        for(int i=0;i<length;i++){
            for(int j=0;j<height;j++){
                if(grid[i][j]==0)
                    traverse(grid,i,j,0);
            }
        }
        
    }

    private void traverse(int[][] grid, int i , int j,int dist){

        if(i<0 || j > grid[0].length-1 || i> grid.length -1|| j <0){
            return;
        }
        if(grid[i][j]==-1)
            return;
        
        if (dist > grid[i][j]) 
            return;

        grid[i][j]=Math.min(dist,grid[i][j]);

        traverse(grid,i-1,j,dist+1);
        traverse(grid,i+1,j,dist+1);
        traverse(grid,i,j-1,dist+1);
        traverse(grid,i,j+1,dist+1);        
    }
}
