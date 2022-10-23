package kodlamaIoSimulation.coreLogging;

public class FileLogger implements Logger {

	@Override
	public void log(String string) {
		System.out.println(string + " : Logged to file");

	}

}
