
public class Main {

	public static void main(String[] args) {
		// interfaceler class de�ildir referans tutucudur.
		// Abstracla da yapabilirim diyeceksiniz ama
		// operasyonu imlemte edilmesi gereken durumlarda interface kullan�l�r
		// newlenmezler
		// bir class birden fazla interfaceyi implemte edebilir.
		// classlar birtane class� extends ederler
		ICustomerDal customerDal = new MySqlDal();
		customerDal.add();

	}

}
