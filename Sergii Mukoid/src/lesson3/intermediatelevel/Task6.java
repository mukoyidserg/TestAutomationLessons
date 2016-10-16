package lesson3.intermediatelevel;

public class Task6 {

	public void longestWordInString(String myString) {
		String wordsInString[] = myString.split(" ");
		int result = 0;
		int tempResult = 0;
		String resultWord = "";
		for (String i : wordsInString) {
			tempResult = i.length();
			if (tempResult > result) {
				result = tempResult;
				resultWord = i;
			}
		}
		System.out.println("The longest word in string is '" + resultWord + "', containing " + result + " characters");
	}

	public static void main(String[] args) {
		Task6 myInstance = new Task6();
		myInstance.longestWordInString("The sun is shining brightly");
	}

}
