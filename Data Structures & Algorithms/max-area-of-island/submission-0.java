class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        int maxArea = 0;

        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                if(grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, sinkAndReturnArea(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private int sinkAndReturnArea(int[][] grid, int i, int j) {
        int rows = grid.length;
        int columns = grid[0].length;

        grid[i][j] = 0;
        int currentArea = 0;

        if(i + 1 < rows && grid[i + 1][j] == 1) {
            currentArea += sinkAndReturnArea(grid, i + 1, j);
        }

        if(i - 1 >= 0 && grid[i - 1][j] == 1) {
            currentArea += sinkAndReturnArea(grid, i - 1, j);
        }

        if(j + 1 < columns && grid[i][j + 1] == 1) {
            currentArea += sinkAndReturnArea(grid, i, j + 1);
        }

        if(j - 1 >= 0 && grid[i][j - 1] == 1) {
            currentArea += sinkAndReturnArea(grid, i, j - 1);
        }

        return 1 + currentArea;
    }
}