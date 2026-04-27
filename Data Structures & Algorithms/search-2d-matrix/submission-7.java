class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low,high,mid,row,col;
        int m = matrix.length;
        int n = matrix[0].length;
        low = 0;
        high = n * m -1;
        while(low<=high)
        {
            mid = (low + high)/2;

            row = mid / n;
            col = mid % n;

            if(target == matrix[row][col])
            {
                return true;
            }
            else if(target> matrix[row][col])
            {
                low = mid +1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
    }
}
