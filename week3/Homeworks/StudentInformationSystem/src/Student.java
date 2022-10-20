
public class Student {
	Course course;
	String name;
	String studentNumber;
	String classes;
	double avarage;
	boolean isPass;

	public Student(String name, String studentNumber, String classes, Course course) {
		super();
		this.name = name;
		this.studentNumber = studentNumber;
		this.classes = classes;
		this.course = course;
	}

	void addBulExamNote(int note1, int note2, int int3) {
		if (note1 >= 0 && note1 <= 100) {
			course.note = note1;
		}
	}

}
