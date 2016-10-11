package lesson4;

//Create classes and methods, perform tasks

public class Environment {
	public static final String DATA_FILE = "C://Users//Пользователь//git//SM_TestAutomationLessons//Sergii Mukoid//src//lesson4//Framework.ini";
	String pathToExcelFile = "";
	String databaseDriver = "com.mysql.jdbc.Driver";
	String databaseURL = "";
	String username = "";
	String password = "";

	private String getValueFromFile(String pathToIniFile, String string) {
		return null;
	}

	public void initialiseEnvironmentVariables() {

		this.pathToExcelFile = getValueFromFile(DATA_FILE, "pathToExcelFile");
		this.databaseURL = getValueFromFile(DATA_FILE, "databaseURL");
		this.username = getValueFromFile(DATA_FILE, "username");
		this.password = getValueFromFile(DATA_FILE, "password");
	}
	
	public void createEnvironment() {
		Database myDatabase = new Database(databaseURL, username, password);
		myDatabase.createStructure();
		myDatabase.fillData();
	}

	public void runTests() {
		Test myTests = new Test();
		myTests.readData();
		myTests.executeTestCases();
		myTests.generateReports();
	}


}
