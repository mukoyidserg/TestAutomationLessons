package lesson3.preintermediatelevel;

public class Task12 {
	
public int getDigitSum (int digit) {
	int result = 0;
	String stringDigit = Integer.toString(digit);
	for (int i = 0; i <= stringDigit.length() - 1; i++) {
		result += Integer.parseInt(stringDigit.substring(i, i+1));
	}
	return result;
}

	public static void main(String[] args) {
		Task12 myInstance = new Task12();
		System.out.println(myInstance.getDigitSum(687));

	}

}
