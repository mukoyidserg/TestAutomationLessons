package lesson3.intermediatelevel;

public class Task8 {

	public void camelCaseSeparator(String camelString) {
		String wordsInString[] = camelString.split("(?=\\p{Upper})");
		System.out.print(wordsInString[0].substring(0, 1).toUpperCase() + wordsInString[0].substring(1) + " ");
		for (int i = 1; i <= wordsInString.length - 1; i++)
			System.out.print(wordsInString[i].substring(0, 1).toLowerCase() + wordsInString[i].substring(1) + " ");

	}

	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		myInstance.camelCaseSeparator("checkChangingProfilePicture");
	}
}
