
public class Main {

	public static void main(String[] args) {
		// Polimorphism -- �ok bi�imlilik anlam�na gelir

		/*
		 * EmailLogger emailLogger = new EmailLogger(); emailLogger.log("Log mesaj�");
		 */
		BaseLogger[] Loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(),
				new ConsoleLogger() };

		for (BaseLogger base : Loggers) {
			base.log("Log mesaj�");
		}

		System.out.println("**********");

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
