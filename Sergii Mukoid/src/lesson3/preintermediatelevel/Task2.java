package lesson3.preintermediatelevel;

public class Task2 {
	public void swapChars(String text) {
		System.out.print(text.split("")[text.length()-1]);
		for (int i = 1; i <= text.length()-2; i++) {
			System.out.print(text.split("")[i]);
			}
		System.out.print(text.split("")[0]);
		System.out.print("\n");
	}

	public void newSwapChars(String text) {
		String newText = text.substring(text.length()-1)+ text.substring(1,text.length()-1) + text.substring(0,1);
		System.out.println(newText);
	}
	
	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		myInstance.newSwapChars("Cool text");
		myInstance.newSwapChars("QA Automation");
		myInstance.newSwapChars("Tuesday");
	}

}
