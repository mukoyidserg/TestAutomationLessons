package lesson3.beginnerlevel;

public class Task8 {

	public void printCharacters (String text, int symbols) {
		try {
		for (int i = 1; i <= symbols; i++) {
			for (int j = 0; j <= symbols- i - 1; j++) {
			System.out.print(text.split("")[j]);
			}
		}
		System.out.print("\n");
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.print("\nWrong number of characters");	
		}
}
	
	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		myInstance.printCharacters("Test", 0);
		myInstance.printCharacters("Test", 1);
		myInstance.printCharacters("Test", 2);
		myInstance.printCharacters("Test", 3);
		myInstance.printCharacters("Test", 4);
		myInstance.printCharacters("Test", 5);
	}

}
