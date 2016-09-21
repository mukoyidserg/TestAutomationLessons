package lesson3.preintermediatelevel;

public class Task4 {
	static int[] myArray = {1,2,3,6,7,8,9,10,11,10000000,2,3,8,7,8,9,10,11,12};
	
	public static void main(String[] args) {
		int half = (int) Math.ceil(myArray.length/2);   
		for (int i = half; i < myArray.length; i++) {
			System.out.print(myArray [i] + " ");
		}
		

	}

}
