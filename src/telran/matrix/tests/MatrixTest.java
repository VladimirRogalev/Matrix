package telran.matrix.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.matrix.utils.Matrix;

class MatrixTest {
	int[][] matrix1 = { { 1, 2, 3 } };
	int[][] matrix2 = { { 1 }, { 2 }, { 3 } };

	@Test
	void testSum() {
		assertEquals(6, Matrix.sum(matrix1));
		assertEquals(6, Matrix.sum(matrix2));
	}

	@Test
	void testTransp() {
		assertArrayEquals(matrix2, Matrix.transp(matrix1));
	}

}
