package lesson3.advancedlevel;

import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

public class Task1 {
	// Random symbol type choice!
	public void passwordGenerator() {
		int maxPasswordLength = 15;
		int passwordLength = ThreadLocalRandom.current().nextInt(8, maxPasswordLength + 1);
		int passwordLettersNumber = ThreadLocalRandom.current().nextInt(2, passwordLength);
		int passwordDigitsNumber = passwordLength - passwordLettersNumber;
		int passwordUpperCaseLettersNumber = ThreadLocalRandom.current().nextInt(1, passwordLettersNumber);
		int passwordLowerCaseLettersNumber = passwordLettersNumber - passwordUpperCaseLettersNumber;
		String[] passwordArray = new String[passwordLength];
		String letters = "abcdefghijklmnoprstquvwxyz";
		for (int a = 0; a <= passwordUpperCaseLettersNumber - 1; a++) {
			int tempChar = ThreadLocalRandom.current().nextInt(0, 26);
			passwordArray[a] = Character.toString(letters.charAt(tempChar)).toUpperCase();
		}
		for (int b = passwordUpperCaseLettersNumber; b <= passwordUpperCaseLettersNumber
				+ passwordLowerCaseLettersNumber - 1; b++) {
			int tempChar = ThreadLocalRandom.current().nextInt(0, 26);
			passwordArray[b] = Character.toString(letters.charAt(tempChar)).toLowerCase();
		}
		for (int c = passwordUpperCaseLettersNumber + passwordLowerCaseLettersNumber; c <= passwordLength - 1; c++) {
			int tempChar = ThreadLocalRandom.current().nextInt(0, 10);
			passwordArray[c] = Integer.toString(tempChar);
		}
		System.out.println("Password length: " + passwordLength + "\nLetters: " + passwordLettersNumber
				+ "\nUpperCase: " + passwordUpperCaseLettersNumber + "\nLowerCase: " + passwordLowerCaseLettersNumber
				+ "\nDigits: " + passwordDigitsNumber);
		Collections.shuffle(Arrays.asList(passwordArray));
		String password = Arrays.toString(passwordArray).replace(", ", "").replace("[", "").replace("]", "");
		System.out.print("Generated password: " + password);
	}

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		myInstance.passwordGenerator();
	}
}
