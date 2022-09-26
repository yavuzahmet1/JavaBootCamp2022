
public class ProductValidator {

	public ProductValidator() {
		System.out.println("Yapýcý blok çalýþtý. ");
	}

	public boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
}
