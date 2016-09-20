package lesson3.preintermediatelevel;


public class Task3 {
	public boolean checkTwentyOne(int x, int y) {
		boolean result = false;
		if ((x == 21) || (y == 21) || (x + y == 21))
			result = true;

		return result;
	}

	public static void main(String[] args) {
		Task3 myInstance = new Task3();
        System.out.println(myInstance.checkTwentyOne(5,3));
        System.out.println(myInstance.checkTwentyOne(21,4));
        System.out.println(myInstance.checkTwentyOne(10,21));
        System.out.println(myInstance.checkTwentyOne(11,10));
        System.out.println(myInstance.checkTwentyOne(9,12));
        System.out.println(myInstance.checkTwentyOne(21,21));
        System.out.println(myInstance.checkTwentyOne(-5,26));
        System.out.println(myInstance.checkTwentyOne(81,1));
	}

}