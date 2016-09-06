package lesson3.beginnerlevel;

public class Task2 {
	public boolean checkTwoNumbers(int x, int y) {
		boolean result = false;
		if ((x == 10) || (y == 10) || (x + y == 10))
			result = true;

		return result;
	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
        System.out.println(myInstance.checkTwoNumbers(5,3));
        System.out.println(myInstance.checkTwoNumbers(6,4));
        System.out.println(myInstance.checkTwoNumbers(10,2));
        System.out.println(myInstance.checkTwoNumbers(0,10));
        System.out.println(myInstance.checkTwoNumbers(2,10));
	}

}
