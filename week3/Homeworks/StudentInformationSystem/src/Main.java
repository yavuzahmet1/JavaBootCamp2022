
public class Main {

	public static void main(String[] args) {
		Teacher teacher = new Teacher("Naim", "54284252121", "C#");
		// teacher.print();

		Course course = new Course("Tarih", "101", "C#", 90);
		course.addTeacher(teacher);

	}

}
