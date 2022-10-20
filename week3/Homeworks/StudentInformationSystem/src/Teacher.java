
public class Teacher {
	String name;
	String telephoneNumber;
	String branch;

	public Teacher(String name, String telephoneNumber, String branch) {
		super();
		this.name = name;
		this.telephoneNumber = telephoneNumber;
		this.branch = branch;
	}

	public void print() {
		System.out.println("Name : " + name);
		System.out.println("Mobil Phone Number : " + telephoneNumber);
		System.out.println("Branch : " + branch);
	}

}
