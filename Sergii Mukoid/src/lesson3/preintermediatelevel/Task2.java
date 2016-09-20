package lesson3.preintermediatelevel;

public class Task2 {
	public void swapChar(String text) {
		System.out.print(text.split("")[text.length()-1]);
		for (int i = 1; i <= text.length()-2; i++) {
			System.out.print(text.split("")[i]);
			}
		System.out.print(text.split("")[0]);
		System.out.print("\n");
	}
	
	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		myInstance.swapChar("Cool text");
		myInstance.swapChar("QA Automation");
		myInstance.swapChar("Tuesday");
	}

}
