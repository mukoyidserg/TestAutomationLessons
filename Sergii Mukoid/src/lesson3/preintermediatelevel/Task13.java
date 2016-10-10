package lesson3.preintermediatelevel;

public class Task13 {

	public void solveQuadraticEquation(int a, int b, int c) {
		int discriminant = b*b - 4*a*c;
		if (discriminant >= 0) {
			System.out.println("Equation has two roots: "+
		((-b-Math.sqrt(discriminant))/(2*a))+" and "+
		((-b+Math.sqrt(discriminant))/(2*a)));
		}
		else System.out.println("Equation has no rational solutions");
	}
	
	public static void main(String[] args) {
		Task13 myInstance = new Task13();
		myInstance.solveQuadraticEquation(1,2,3);
	}

}
