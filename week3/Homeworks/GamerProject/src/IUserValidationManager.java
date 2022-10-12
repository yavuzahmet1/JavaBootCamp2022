
public class IUserValidationManager implements IUserValidationService {

	@Override
	public boolean validate(Gamer gamer) {
		if (gamer.getBirthYear() == 1985 && gamer.getName() == "Ahmet") {
			return true;
		} else {
			return false;
		}

	}

}
