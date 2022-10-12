
public class GamerManager implements IGamerService {
	IUserValidationService userValidationService;

	public GamerManager(IUserValidationService userValidationService) {
		super();
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if (userValidationService.validate(gamer) == true) {
			System.out.println(gamer.getName() + " Kayýt olundu.");
		} else {
			System.out.println("Doðrulama baþarýsýz. kayýt baþarýsýz");
		}

	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getName() + "Kayýt güncellendi.");

	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getName() + "Kayýt silindi.");

	}

}
