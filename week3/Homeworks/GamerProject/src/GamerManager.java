
public class GamerManager implements IGamerService {
	IUserValidationService userValidationService;

	public GamerManager(IUserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer) == true) {
			System.out.println(gamer.getName() + " Kay�t olundu.");
		} else {
			System.out.println("Do�rulama ba�ar�s�z. kay�t ba�ar�s�z");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName() + "Kay�t g�ncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + "Kay�t silindi.");

	}

}
