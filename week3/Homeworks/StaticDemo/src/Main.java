
public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.id = 1;
		product.name = "Computer";
		product.price = 12.0;
		productManager.add(product);

		DatabaseHelper.crud.delete();
		DatabaseHelper.connection.createConnection();// bunlar� �nermiyoruz
		// birbirinize benzeyen operasyonlar�n� par�alay�n
		// bir s�n�f bir i�i yapar SOLID mant���yla kullanmam�z laz�m
		// bu t�r yap�lar sekt�rde yok gibi.

	}

}
