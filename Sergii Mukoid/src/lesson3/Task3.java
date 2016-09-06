package lesson3;

public class Task3 {
public boolean checkMultiple(int x) {
	boolean result = false;
	if ((x>=0) && ((x % 3 == 0) || (x % 5 == 0)))
		result = true;
	return result;
} 
	public static void main(String[] args) {
		Task3 myInstance = new Task3();
        System.out.println(myInstance.checkMultiple(15));
        System.out.println(myInstance.checkMultiple(6));
        System.out.println(myInstance.checkMultiple(7));
        System.out.println(myInstance.checkMultiple(-15));
        System.out.println(myInstance.checkMultiple(-6));
        System.out.println(myInstance.checkMultiple(-7));
        System.out.println(myInstance.checkMultiple(0));
	}

}
