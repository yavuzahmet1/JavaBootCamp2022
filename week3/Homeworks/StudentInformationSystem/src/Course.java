
public class Course {
	Teacher teacher;
	String name;
	String code;
	String prefix;
	int note;

	public Course(String name, String code, String prefix, int note) {
		super();
		this.name = name;
		this.code = code;
		this.prefix = prefix;
		this.note = note;
	}

	void addTeacher(Teacher teacher) {
		if (teacher.branch.equals(prefix)) {
			this.teacher = teacher;
			printTeacherInfo();
		} else {
			System.out.println("��retmen ve ders b�l�mleri uyu�muyor");
		}

		// printTeacherInfo();
	}

	void printTeacherInfo() {
		teacher.print();
	}

}
