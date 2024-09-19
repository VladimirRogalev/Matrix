package telran.matrix.utils;

public class Matrix {
	public static int sum(int[][] matrix) {
		int res = 0;
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {
				res += matrix[i][j];
			}
		}

		return res;
	}

	public static int[][] transp(int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		int transpMatrix[][] = new int[cols][rows];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();

		}
		System.out.println("========");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpMatrix[j][i] = matrix[i][j];
				System.out.println(transpMatrix[j][i] + "\t");
			}

		}
		return transpMatrix;
	}

}
