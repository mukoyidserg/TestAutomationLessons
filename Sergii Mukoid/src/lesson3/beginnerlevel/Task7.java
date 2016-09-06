package lesson3.beginnerlevel;

import com.google.common.primitives.Ints;

public class Task7 {
	
public int returnMaxElement(int[] myArray){
return Ints.max(myArray);
}

public int returnMinElement(int[] myArray){
return Ints.min(myArray);
}

	public static void main(String[] args) {
	int[] myArray = {1,2,3,5,6,8,9,34,56,76,1};
		Task7 myInstance = new Task7();
    System.out.println(myInstance.returnMaxElement(myArray));
    System.out.println(myInstance.returnMinElement(myArray));
	}

}
