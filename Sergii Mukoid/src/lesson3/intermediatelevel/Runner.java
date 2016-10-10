package lesson3.intermediatelevel;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;


public class Runner {
	String descriptionPath = "C://Users//SERG//Downloads//TestAutomationLessons//Sergii Mukoid//src//lesson3//intermediatelevel//TaskDescription";
	String writePath = "C://Users//SERG//Desktop//Tasks.xls";
	
	
	public void allintermediateTaskDisplay() {
		try (BufferedReader br = new BufferedReader(new FileReader(descriptionPath))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intermediateTaskWriteByNumber(int number) throws BiffException, WriteException {
		try (BufferedReader br = new BufferedReader(new FileReader(descriptionPath))) {

			String sCurrentLine;
			lesson3.beginnerlevel.JExcelAPI writeFile = new lesson3.beginnerlevel.JExcelAPI();

			while ((sCurrentLine = br.readLine()) != null) {
				if (Integer.toString(number).equals(sCurrentLine.substring(0, Integer.toString(number).length())))
					writeFile.writeToExcel(writePath, "Task", 3, 3, sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void intermediateTaskRun() throws BiffException, WriteException, InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException,
			ClassNotFoundException {
		try {
		Scanner reader = new Scanner(System.in);
		System.out.println("Which task do you want to run? ");
		int number = reader.nextInt();
		System.out.println("Task description: ");
		try (BufferedReader br = new BufferedReader(new FileReader(descriptionPath))) {
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				if ((Integer.toString(number)+".").equals(sCurrentLine.substring(0, Integer.toString(number).length()+1)))
					System.out.println(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Running the chosen task... ");
		String taskName = "lesson3.intermediatelevel.Task" + number;
		Class.forName(taskName).getMethod("main", String[].class).invoke(null, (Object) null);
		}
		catch (ClassNotFoundException err) {System.out.println("No task found");}
	}

	public static void main(String[] args) throws BiffException, WriteException, ClassNotFoundException,
			InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
		Runner myInstance = new Runner();
		myInstance.intermediateTaskRun();
	}
}

