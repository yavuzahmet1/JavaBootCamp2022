
public class Main {

	public static void main(String[] args) {
		GamerManager gamer = new GamerManager(new IUserValidationManager());
		gamer.add(new Gamer(1, "Ahmet", "Yavuz", 1985, 123456789));

	}

}
