
public class Main {

	public static void main(String[] args) {
		// Polimorphism -- çok biçimlilik anlamýna gelir

		/*
		 * EmailLogger emailLogger = new EmailLogger(); emailLogger.log("Log mesajý");
		 */
		BaseLogger[] Loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(),
				new ConsoleLogger() };

		for (BaseLogger base : Loggers) {
			base.log("Log mesajý");
		}

		System.out.println("**********");

		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();

	}

}
