
public class Gamer {
	private int id;
	private String name;
	private String lastName;
	private int birthYear;
	private long identitiyNumber;

	public Gamer() {
		super();
	}

	public Gamer(int id, String name, String lastName, int birthYear, long identitiyNumber) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.birthYear = birthYear;
		this.identitiyNumber = identitiyNumber;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public long getIdentitiyNumber() {
		return identitiyNumber;
	}

	public void setIdentitiyNumber(long identitiyNumber) {
		this.identitiyNumber = identitiyNumber;
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

}
