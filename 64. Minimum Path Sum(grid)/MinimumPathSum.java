class MinimumPathSum
{
	public static void main(String [] args)
	{
		int [][] arr ={{1,3,1},{1,5,1},{4,2,1}};
		int res = minPathSum(arr);
		System.out.println(res);
	}
	public static int minPathSum(int[][] grid)
	{
         int rows = grid.length;
        int cols = grid[0].length;

        // Calculate minimum path sum for the first row
        for (int j = 1; j < cols; j++) 
		{
            grid[0][j] += grid[0][j-1];
        }

        // Calculate minimum path sum for the first column
        for (int i = 1; i < rows; i++) {
            grid[i][0] += grid[i-1][0];
        }

        // Calculate minimum path sum for the remaining cells
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }

        // Return the minimum path sum for the last cell
        return grid[rows-1][cols-1];
    }
	//recusrion approach
	
	public static int minPathSum(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        return minPathSumHelper(grid, rows-1, cols-1);
    }

    private static int minPathSumHelper(int[][] grid, int row, int col) {
        if (row == 0 && col == 0) {
            return grid[0][0];
        }

        if (row == 0) {
            return grid[0][col] + minPathSumHelper(grid, row, col-1);
        }

        if (col == 0) {
            return grid[row][0] + minPathSumHelper(grid, row-1, col);
        }

        return grid[row][col] + Math.min(minPathSumHelper(grid, row-1, col), minPathSumHelper(grid, row, col-1));
    }
}