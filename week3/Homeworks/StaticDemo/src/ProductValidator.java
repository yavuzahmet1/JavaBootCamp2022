
public class ProductValidator {

	public ProductValidator() {
		System.out.println("Yap�c� blok �al��t�. ");
	}

	public boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
