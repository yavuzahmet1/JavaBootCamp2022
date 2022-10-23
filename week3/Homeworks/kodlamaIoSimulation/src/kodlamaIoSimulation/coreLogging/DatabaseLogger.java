package kodlamaIoSimulation.coreLogging;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String string) {
		System.out.println(string + " : Logged to database");

	}

}
