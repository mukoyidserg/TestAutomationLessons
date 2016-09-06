package lesson3.beginnerlevel;

public class Task6 {
public void getAllEvenNumbersFirstWay () {
	for(int i = 2;i <= 50;i+=2) {
		System.out.print(i+" ");
	}
}

public void getAllEvenNumbersSecondWay () {
	int i = 2;
	while(i<=50) {
		System.out.print(i+" ");
		i+=2;
	}
		
}

	public static void main(String[] args) {
	Task6 myInstance = new Task6();
	myInstance.getAllEvenNumbersFirstWay();
	System.out.println("");
	myInstance.getAllEvenNumbersSecondWay();
	}

}
