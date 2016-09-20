package lesson3.beginnerlevel;

public class Task9 {
	public void accurateDivision (int a, int b) {
		double div = ((double) a)/((double) b);
		System.out.println(div);
	}

	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		myInstance.accurateDivision(9, 4);
		myInstance.accurateDivision(100, 50);
		myInstance.accurateDivision(8, 0);
	}

}
