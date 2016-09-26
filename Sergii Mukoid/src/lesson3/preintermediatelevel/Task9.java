package lesson3.preintermediatelevel;

public class Task9 {

	public void returnMultiplicationTable(int i) {
        for (int j = 1; j<=10; j++) {
        	System.out.println(i+" * "+j+" = "+i*j);
        }
		
	}
	
	public static void main(String[] args) {
		Task9 myInstance = new Task9();
		myInstance.returnMultiplicationTable(2);
		myInstance.returnMultiplicationTable(5);
		myInstance.returnMultiplicationTable(8);
	}

	

}
