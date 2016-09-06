package lesson3.beginnerlevel;

public class Task1 {
	int[] myArray = {1,2,3};

	public static void main(String[] args) {
		int[][] myArray = {{1,2,3,6,7,8,9,10,11,12},{1,2,3,8,7,8,9,10,11,12}};
		int j=0;
		for(int[] i:myArray) {
			
			System.out.println(myArray[j][3]*3);	
			j++;
		}	
}}
