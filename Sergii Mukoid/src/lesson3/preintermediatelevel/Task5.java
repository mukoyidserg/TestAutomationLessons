package lesson3.preintermediatelevel;

public class Task5 {

	public boolean showIfBadNumbers (int[] myArray) {
		boolean result = true;
		
		for (int i:myArray) {
			if (i == 7 || i == 9) result = false;
	}
		return result;
	}
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,6,8,10,11,10000000,2,3,8,10,11,12};
		Task5 myInstance = new Task5();
		System.out.println(myInstance.showIfBadNumbers(myArray));

	}

}
