package lesson3.intermediatelevel;

import java.util.Scanner;

public class Task2 {

	public int luckyTicketCalculator() {
		String rollStart = "000001";
		String rollFinish = "999999";
		int result = 0;
		for (int i = 0; i <= rollStart.length() - 1; i++) {
			result += Integer.parseInt(rollStart.substring(i, i + 1));
		}
		return result;
	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		System.out.println(myInstance.luckyTicketCalculator());

}
