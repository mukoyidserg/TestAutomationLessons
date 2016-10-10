package lesson3.beginnerlevel;

public class Task10 {
	public void starPrintTwoLoops (int a) {
		if (a<1 || a>9) System.out.println("Wrong number of characters");
		else {
			for (int i = 1; i <= a; i++) {
				for (int j = 1; j <= i; j++) {
				System.out.print("*");
				}
				System.out.print("\n");
			}
			for (int i = 1; i <= a-1; i++) {
				for (int j = 1; j <= a - i; j++) {
				System.out.print("*");
				}
				System.out.print("\n");
			}
		}
	}

	public void starPrintOneLoop (int a) {
		if (a<1 || a>9) System.out.println("Wrong number of characters");
		else {
			int flag =1;
			for (int i = 1; i <= 2*a-1; i++) {
				for (int j = 1; j <= flag; j++) {
				System.out.print("*");
				}
				flag = (i < a) ? flag+1 : flag-1;
				System.out.print("\n");
			}
			
		}
	}
	
//Implement this task with array using any SINGLE loop.
//In addition, use dynamic arrays. Read about them in Java.
	
//Alternatively use 'flag' variable, which changes direction after half of the loop (IF).
	
	public static void main(String[] args) {
		Task10 myInstance = new Task10();
		myInstance.starPrintOneLoop(6);

	}

}
