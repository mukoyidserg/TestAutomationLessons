package lesson3.preintermediatelevel;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Task8 {
	private double [] myArray = new double [150];
	public double countHundredFibonacci () {
		myArray [0] = 1;
		myArray [1] = 1;
		double oddSum = 2;
		for (int i = 2; i <= 149; i++) {
			myArray[i] = myArray[i-1] + myArray[i-2];
			if (myArray[i]%2 != 0) {
				oddSum += myArray[i];
			}
		}
		return oddSum;
		
	}
	
	public static void main(String[] args) {
		Task8 myInstance = new Task8();
		NumberFormat formatter = new DecimalFormat("#0.00");
		System.out.println(formatter.format(myInstance.countHundredFibonacci()));
	}

}
