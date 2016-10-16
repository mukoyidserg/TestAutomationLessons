package lesson3.intermediatelevel;

import java.util.Arrays;

public class Task3 {

	public void reverseArray(int[] arrayToReverse) {
		int[] reversedArray = new int [arrayToReverse.length];
		for (int i = 0; i <= arrayToReverse.length-1; i++) {
			reversedArray[i] = arrayToReverse[arrayToReverse.length-1-i]; 
		}
		System.out.println(Arrays.toString(reversedArray));
	}

	public void reverseArray(String[] arrayToReverse) {
		String[] reversedArray = new String [arrayToReverse.length];
		for (int i = 0; i <= arrayToReverse.length-1; i++) {
			reversedArray[i] = arrayToReverse[arrayToReverse.length-1-i]; 
		}
		System.out.println(Arrays.toString(reversedArray));
	}
	
	public static void main(String[] args) {
		//int[] myArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
		String[] myArray = { "a", "b", "c" };
		Task3 myInstance = new Task3();
		myInstance.reverseArray(myArray);
	}

}
