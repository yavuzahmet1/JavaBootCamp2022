package kodlamaIoSimulation.coreLogging;

public class MailLogger implements Logger {

	@Override
	public void log(String string) {
		System.out.println(string + " : Logged to mail");

	}

}
