package kodlamaIoSimulation.entities;

public class Course implements Base {
	private int id;
	private String name;
	private double price;

	public Course(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDuration() {
		return price;
	}

	public void setDuration(double price) {
		this.price = price;
	}

}
