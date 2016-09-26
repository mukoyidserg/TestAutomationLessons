package lesson3.preintermediatelevel;

public class Task6 {

	public int countElementsSum (int[] myArray) {
		int sum = 0;
		
		for (int i:myArray) sum +=i;

		return sum;
	}
	
	public int countElementsAvg (int[] myArray) {
        int avg = countElementsSum(myArray) / myArray.length;
		
		return avg;
	
	}
	
	public int countElementsMin (int[] myArray) {
		int min = myArray[0];
		for (int i:myArray) if (min > i) min = i;
		return min;
	}
	
	public int countElementsMax (int[] myArray) {
		int max = myArray[0];
		for (int i:myArray) if (max < i) max = i;
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] myArray = {1,2,3,6,8,10,11,10000000,2,3,8,10,11,12};
		Task6 myInstance = new Task6();
		System.out.println(myInstance.countElementsSum(myArray));
		System.out.println(myInstance.countElementsAvg(myArray));
		System.out.println(myInstance.countElementsMin(myArray));
		System.out.println(myInstance.countElementsMax(myArray));
	}

}
