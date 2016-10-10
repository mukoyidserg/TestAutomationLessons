package lesson3.preintermediatelevel;

public class Task14 {

	public void diagonalPrint(String text) {
		for (int i = 1; i <= text.length();i++){
			for (int j = 0; j <= i-1;j++) System.out.print(" ");
			System.out.println(text.substring(i-1, i));
		}
		
	}
	
	public static void main(String[] args) {
		Task14 myInstance = new Task14();
		myInstance.diagonalPrint("Tuesday");

	}

	

}
