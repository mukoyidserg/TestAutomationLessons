package lesson3.beginnerlevel;

public class Task5 {

public String returnMarkName (int mark) {
	String[] markname = {"Invalid mark", "Not passed","Failed","Satisfactory","Good","Excellent"};

	
	return markname[mark];
}


	public static void main(String[] args) {
	Task5 myInstance = new Task5 ();
	try {
	for(int i = 1;i<=10;i++) {
	System.out.println("The name of mark "+i+" is "+myInstance.returnMarkName(i));
	}
	} catch(ArrayIndexOutOfBoundsException ex){
		System.out.println("We don't have value name for your mark");
	}
	}

}


