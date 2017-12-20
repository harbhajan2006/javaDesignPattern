package logical;

import matrix.MatrixUtility;

public class Find0InMatrix {
static int rowLen=3;
static int colLen=3;
	static int matrix[][]=new int[rowLen][colLen];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println((int)Math.floor(Math.random()*10));
		int mat[][]=MatrixUtility.createMatrix(3, 3);
		MatrixUtility.populateMatrix(mat);
		MatrixUtility.printMatrix(mat);
		setZeros(matrix);
		System.out.println("********************");
		MatrixUtility.printMatrix(mat);
	}

	static void setZeros(int matrix[][]){
		int[] row = new int[matrix.length];
		int [] col = new int[matrix[0].length];
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					System.out.println("hello");
					row[i]=1;
					col[j]=1;
					//matrix[i][j]=90;
				}
			}
		}
		
		//MatrixUtility.printMatrix(mat);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
			if(row[i]==1 || col[j]==1){
				matrix[i][j]=0;
			}
			}
			}
		
	}
	

}
