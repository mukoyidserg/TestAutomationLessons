package lesson3.intermediatelevel;


public class Task4 {

	public int getStringNumbersSum(String myString) {
		myString = myString.replaceAll("\\D+","");
		int result = 0;
		for (int i = 0; i <= myString.length() - 1; i++) {
			result += Integer.parseInt(myString.substring(i, i + 1));
		}
		return result;
	}

	public static void main(String[] args) {
		Task4 myInstance = new Task4();
		System.out.println(myInstance.getStringNumbersSum("aa49b55"));

	}
}
	


