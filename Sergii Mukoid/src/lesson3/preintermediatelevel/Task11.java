package lesson3.preintermediatelevel;

public class Task11 {
	static int[] myArray = {6,8,10,11,10000000,2,3,8,10,11,12};
	public boolean checkArrayOneTwoThree () {
		boolean result = false;
		for (int i = 0; i <= myArray.length - 3; i++ ) {
			if (myArray[i] == 1 && myArray[i+1] == 2 && myArray[i+2] == 3) result = true;
		}
		return result;
	}
	public static void main(String[] args) {
		Task11 myInstance = new Task11();
		System.out.println(myInstance.checkArrayOneTwoThree());
	}
}
