
public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Computer";
		product.price = 12.0;
		productManager.add(product);

		DatabaseHelper.crud.delete();
		DatabaseHelper.connection.createConnection();// bunlarý önermiyoruz
		// birbirinize benzeyen operasyonlarýný parçalayýn
		// bir sýnýf bir iþi yapar SOLID mantýðýyla kullanmamýz lazým
		// bu tür yapýlar sektörde yok gibi.

	}

}
