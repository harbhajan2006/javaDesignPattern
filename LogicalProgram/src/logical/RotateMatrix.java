package logical;

import matrix.MatrixUtility;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int mat[][] = MatrixUtility.createMatrix(3, 3);
MatrixUtility.populateMatrix(mat);
MatrixUtility.printMatrix(mat);
MatrixUtility.rotateMatrix(mat);
System.out.println("**********************");
MatrixUtility.printMatrix(mat);
	}

	
	
}
