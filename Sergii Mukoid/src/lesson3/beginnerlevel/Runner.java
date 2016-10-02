package lesson3.beginnerlevel;

import java.util.Scanner;

//Create runner class for each difficulty level in Lesson 3. 
//Upon running the method should ask which task to display and then show the actual task and your solution.

public class Runner {
	
	public void beginnerTaskDisplay() {
		Scanner reader = new Scanner(System.in);  
		System.out.println("Which task do you want to display? ");
		int taskNum = reader.nextInt();
		String taskName = "Task"+taskNum;
		//Class Taskt = Class.forName(taskName);
		//Object taskInstance = Task.newInstance();
		Class.forName(taskName).main(String[] args);
	}

	public static void main(String[] args) {
		Runner myInstance = new Runner();
		myInstance.beginnerTaskDisplay();
		//Task1 myIn = new Task1();
		//myIn.main(args);
	}

}
