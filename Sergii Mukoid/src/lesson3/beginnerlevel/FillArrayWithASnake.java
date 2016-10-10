package lesson3.beginnerlevel;

import java.util.Arrays;

public class FillArrayWithASnake {

	public void ArraySnakeFill (int arraySize) {
		int dimension = (int) Math.sqrt(arraySize);
		int [][] myArray = new int [dimension][dimension];
		myArray[0][0] = 1;
		myArray[1][0] = 2;
		int directionGrow = 1;
		int i = 1;
		int j = 0;
		for (int n = 3; n <= arraySize; n++) {
			if (directionGrow == 1) {
					i-=1;
					j+=1;
				}
				else {
					i+=1;
					j-=1;
				}
			myArray[i][j] = n;
			if (i == dimension - 1) {
				j+=1;
				n+=1;
				myArray[i][j] = n;
				directionGrow = 1;
			}
			if (j == dimension - 1) {
				i+=1;
				n+=1;
				myArray[i][j] = n;
				directionGrow = 0;
			}
			if (j == 0) {
				i+=1;
				n+=1;
				myArray[i][j] = n;
				directionGrow = 1;
			}
			if (i == 0) {
				j+=1;
				n+=1;
				myArray[i][j] = n;
				directionGrow = 0;
			}
			}
			System.out.println(Arrays.deepToString(myArray).replace("], ", "]\n"));
		}
	
	public static void main(String[] args) {
		FillArrayWithASnake myInstance = new FillArrayWithASnake();
        myInstance.ArraySnakeFill(100);
	}

}
