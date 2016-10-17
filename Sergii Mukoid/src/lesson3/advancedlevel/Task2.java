package lesson3.advancedlevel;

public class Task2 {

	public void arabicYearToRoman(int year) {
		if (year == 0)
			System.out.print("nulla");
		else {
			if (year < 0 || year > 2017)
				System.out.print("Year conversion is not supported");
			else {
				int thousands = (int) Math.floor(year / 1000);
				int hundreds = (int) Math.floor((year - thousands * 1000) / 100);
				int tens = (int) Math.floor((year - thousands * 1000 - hundreds * 100) / 10);
				int ones = (int) Math.floor((year - thousands * 1000 - hundreds * 100 - tens * 10));
				
			}
		}

	}

	public static void main(String[] args) {
		Task2 myInstance = new Task2();
		myInstance.arabicYearToRoman(2016);
	}


