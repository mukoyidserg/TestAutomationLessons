package lesson4;

public class Runner {

	public static void main(String[] args) {
		Environment myInstance = new Environment();
		myInstance.initialiseEnvironmentVariables();
		myInstance.createEnvironment();
		myInstance.runTests();
	}
}
