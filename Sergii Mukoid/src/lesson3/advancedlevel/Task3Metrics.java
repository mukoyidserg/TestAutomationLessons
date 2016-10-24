package lesson3.advancedlevel;

public class Task3Metrics {
	private boolean testCasesPercentageSuccess = true;
	private boolean highPriorityBugsSuccess = true;
	private boolean blockerSevereBugsSuccess = true;
	private boolean blockerBugsPercentageSuccess = true;
	private boolean buildSuccess = false;

	public boolean isTestCasesPercentageSuccess() {
		return testCasesPercentageSuccess;
	}

	public boolean isHighPriorityBugsSuccess() {
		return highPriorityBugsSuccess;
	}

	public boolean isBlockerSevereBugsSuccess() {
		return blockerSevereBugsSuccess;
	}

	public boolean isBlockerBugsPercentageSuccess() {
		return blockerBugsPercentageSuccess;
	}

	public boolean isBuildSuccess() {
		return buildSuccess;
	}

	public Task3Metrics(int passedTestCases, int failedTestCases, int totalBugs, int highPriorityBugs,
			int blockerCriticalBugs) {
		int totalTestCases = passedTestCases + failedTestCases;
		if ((float) failedTestCases / (float) totalTestCases >= 0.2)
			this.testCasesPercentageSuccess = false;
		if (highPriorityBugs > 10)
			this.highPriorityBugsSuccess = false;
		if (blockerCriticalBugs >= 5)
			this.blockerSevereBugsSuccess = false;
		if ((float) blockerCriticalBugs / (float) totalBugs > 0.05)
			this.blockerBugsPercentageSuccess = false;
		if (testCasesPercentageSuccess == highPriorityBugsSuccess == blockerSevereBugsSuccess == blockerBugsPercentageSuccess == true)
			this.buildSuccess = true;
		System.out.println("--Build Statistics--\nPassed Test Cases: " + passedTestCases + "\nFailed Test Cases: "
				+ failedTestCases + "\nTotal Bugs: " + totalBugs + "\nHigh Priority Bugs: " + highPriorityBugs
				+ "\nBlocker and Critical Bugs: " + blockerCriticalBugs);
	}
}
