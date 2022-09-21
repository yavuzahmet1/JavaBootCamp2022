package week2OOP1;

public class Product {
	private String name;
	private double unitPrice;
	private double discount;
	private String imageUrl; // String[] imageUrl; çok foto olursa dizi þeklinden kullanýlýr.
	private int unitInStock;

	public Product() {

	}

	public Product(String name, double unitPrice, double discount, String imageUrl, int unitInStock) {
		super();
		this.name = name;
		this.unitPrice = unitPrice;
		this.discount = discount;
		this.imageUrl = imageUrl;
		this.unitInStock = unitInStock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

}
