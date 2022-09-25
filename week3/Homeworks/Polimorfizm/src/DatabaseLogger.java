
public class DatabaseLogger extends BaseLogger {
	@Override
	public void log(String message) {
		System.out.println("Log to database : " + message);
	}

}
