package lesson3;

public class Task4 {
	public int numberQuantity(int[] array, int x) {
		int quantity = 0;
		for (int i : array) {
			if (i == x)
				quantity++;
		}
		return quantity;
	}

	public static void main(String[] args) {
		Task4 myInstance = new Task4();
		int [] myArray = {1,1,2,5,6,7,5,9,0,4,4,3,4};
		System.out.println(myInstance.numberQuantity(myArray, 4));
		System.out.println(myInstance.numberQuantity(myArray, 5));
		System.out.println(myInstance.numberQuantity(myArray, 12));
		System.out.println(myInstance.numberQuantity(myArray, 1));
		System.out.println(myInstance.numberQuantity(myArray, 0));
	}

}
