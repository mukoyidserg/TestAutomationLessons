package lesson3.advancedlevel;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Task3Build {
	private int passedTestCases;
	private int failedTestCases;
	private int totalBugs;
	private int highPriorityBugs;
	private int blockerCriticalBugs;

	public int getPassedTestCases() {
		return passedTestCases;
	}

	public int getFailedTestCases() {
		return failedTestCases;
	}

	public int getTotalBugs() {
		return totalBugs;
	}

	public int getHighPriorityBugs() {
		return highPriorityBugs;
	}

	public int getBlockerCriticalBugs() {
		return blockerCriticalBugs;
	}

	public void readTestResults(String inputFile) throws BiffException, IOException {
		Sheet sheetWithInput = Workbook.getWorkbook(new File(inputFile)).getSheet(0);
		passedTestCases = Integer.parseInt(sheetWithInput.getCell(1, 0).getContents());
		failedTestCases = Integer.parseInt(sheetWithInput.getCell(1, 1).getContents());
		totalBugs = Integer.parseInt(sheetWithInput.getCell(1, 2).getContents());
		highPriorityBugs = Integer.parseInt(sheetWithInput.getCell(1, 3).getContents());
		blockerCriticalBugs = Integer.parseInt(sheetWithInput.getCell(1, 4).getContents());
	}

	public void buildAssesment(int passedTestCases, int failedTestCases, int totalBugs, int highPriorityBugs,
			int blockerCriticalBugs) {
		Task3Metrics metrics = new Task3Metrics(passedTestCases, failedTestCases, totalBugs, highPriorityBugs,
				blockerCriticalBugs);
		if (metrics.isBuildSuccess() == true)
			System.out.println("--Build Assesment--\nCurrent build is stable!");
		else {
			System.out.println("--Build Assesment--\nCurrent build cannot be released!\nThe reasons are:");
			if (metrics.isTestCasesPercentageSuccess() == false)
				System.out.println("More than 20 percent test cases failed");
			if (metrics.isHighPriorityBugsSuccess() == false)
				System.out.println("More than 10 unsolved high priority bugs");
			if (metrics.isBlockerSevereBugsSuccess() == false)
				System.out.println("At least 5 unsolved Blocker/Critical bugs");
			if (metrics.isBlockerBugsPercentageSuccess() == false)
				System.out.println("More than 5 percent of unsolved nugs are critical");
		}
	}

	public static void main(String[] args) throws BiffException, IOException {
		String workFile = "C://Users//SERG//Desktop//UserInput.xls";
		Task3Build myInstance = new Task3Build();
		myInstance.readTestResults(workFile);
		myInstance.buildAssesment(myInstance.getPassedTestCases(), myInstance.getFailedTestCases(),
				myInstance.getTotalBugs(), myInstance.getHighPriorityBugs(), myInstance.getBlockerCriticalBugs());
	}
}
