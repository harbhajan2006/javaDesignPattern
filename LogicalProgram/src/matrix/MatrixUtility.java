package matrix;

public class MatrixUtility {

	//static int rowLen=3;
	//static int colLen=3;
	//static int matrix[][]=new int[rowLen][colLen];
	
	

	
	static public int[][]	createMatrix(int rowLen,int colLen){
	return new int[rowLen][rowLen];
	}
	
	
	static public int[][]	populateMatrix(int[][] mat){
		int matrix[][]=mat;
		int rowLen=mat.length;
		int colLen=mat[0].length;
		for(int i=0;i<rowLen;i++){
			for(int j=0;j<colLen;j++){
				matrix[i][j]=randomWithRange(1, 9);
			}
		}

		matrix[1][1]=0;
		return matrix;
	}

	static int randomWithRange(int min, int max)
	{
		int range = (max - min) + 1;     
		return (int)(Math.random() * range) + min;
	}


	static public void	printMatrix(int mat[][]){
		int matrix[][]=mat;
		int rowLen=mat.length;
		int colLen=mat[0].length;
		for(int i=0;i<rowLen;i++){
			for(int j=0;j<colLen;j++){
				System.out.print(matrix[i][j]);	
				System.out.print("	");	
			}
			System.out.println();
		}
	}
	
	
	// An Inplace function to rotate a N x N matrix
	// by 90 degrees in anti-clockwise direction
	public static void rotateMatrix(int mat[][])
	{
		int N=mat.length;
	    // Consider all squares one by one
	    for (int x = 0; x < N / 2; x++)
	    {
	        // Consider elements in group of 4 in 
	        // current square
	        for (int y = x; y < N-x-1; y++)
	        {
	            // store current cell in temp variable
	            int temp = mat[x][y];
	 
	            // move values from right to top
	            mat[x][y] = mat[y][N-1-x];
	 
	            // move values from bottom to right
	            mat[y][N-1-x] = mat[N-1-x][N-1-y];
	 
	            // move values from left to bottom
	            mat[N-1-x][N-1-y] = mat[N-1-y][x];
	 
	            // assign temp to left
	            mat[N-1-y][x] = temp;
	        }
	    }
	}
}
