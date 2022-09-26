
public class Main {

	public static void main(String[] args) {
		// interfaceler class deðildir referans tutucudur.
		// Abstracla da yapabilirim diyeceksiniz ama
		// operasyonu imlemte edilmesi gereken durumlarda interface kullanýlýr
		// newlenmezler
		// bir class birden fazla interfaceyi implemte edebilir.
		// classlar birtane classý extends ederler
		CustomerManager cusManager = new CustomerManager(new MySqlDal());

		cusManager.add();

	}

}
