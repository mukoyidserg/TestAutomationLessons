package lesson3.beginnerlevel;

public class Task8 {

	public void printCharacters (String text, int symbols) {
		if (text.length() >= symbols & symbols > 0) {
		for (int i = 0; i <= symbols; i++) {
			for (int j = 0; j <= symbols- i - 1; j++) {
			System.out.print(text.split("")[j]);
			}
		}
		System.out.print("\n");
		} else  {
			System.out.println("Wrong number of characters");	
		}
}
	
	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		myInstance.printCharacters("Testingarray", -1);
		myInstance.printCharacters("Testingarray", 0);
		myInstance.printCharacters("Testingarray", 1);
		myInstance.printCharacters("Testingarray", 2);
		myInstance.printCharacters("Testingarray", 3);
		myInstance.printCharacters("Testingarray", 4);
		myInstance.printCharacters("Testingarray", 5);
	}

}
