package lesson3.intermediatelevel;

import java.util.Scanner;

import lesson3.preintermediatelevel.Task12;

public class Task1 {

	public int getDigitSum() {
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter number to use superpower: ");
		int digit = reader.nextInt();
		int result = 0;
		String stringDigit = Integer.toString(digit);
		for (int i = 0; i <= stringDigit.length() - 1; i++) {
			result += Integer.parseInt(stringDigit.substring(i, i + 1));
		}
		return result;
	}

	public static void main(String[] args) {
		Task1 myInstance = new Task1();
		System.out.println(myInstance.getDigitSum());

	}

}
