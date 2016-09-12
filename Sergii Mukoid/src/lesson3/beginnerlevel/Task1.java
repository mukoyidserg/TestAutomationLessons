package lesson3.beginnerlevel;

public class Task1 {
	static int[] myArray = {1,2,3,6,7,8,9,10,11,12,1,2,3,8,7,8,9,10,11,12};
	
	public static void main(String[] args) {
		int j=0;
		for(int i:myArray) {
			
			System.out.println(myArray[j]*3);	
			j++;
		}	
}}
