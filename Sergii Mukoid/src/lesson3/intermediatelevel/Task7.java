package lesson3.intermediatelevel;

import java.util.Arrays;

public class Task7 {

	private void addMatrices(int[][] matrixOne, int[][] matrixTwo) {

		if (matrixOne.length == matrixTwo.length && matrixOne[0].length == matrixTwo[0].length) {
			int[][] sumMatrix = new int[matrixOne.length][matrixOne[0].length];
			for (int i = 0; i <= matrixOne.length - 1; i++) {
				for (int j = 0; j <= matrixOne[0].length - 1; j++) {
					sumMatrix[i][j] = matrixOne[i][j] + matrixTwo[i][j];
				}
			}
			System.out.println(Arrays.deepToString(sumMatrix));
		} else
			System.out.println("Your matrices do not have matching dimentions");
	}

	public static void main(String[] args) {
		Task7 myInstance = new Task7();
		int[][] myMatrixOne = new int[][] { { 1, 0, 5 }, { 0, 4, 0 } };
		int[][] myMatrixTwo = new int[][] { { 0, 8, 0 }, { 7, 0, 6 } };
		myInstance.addMatrices(myMatrixOne, myMatrixTwo);

	}

}
