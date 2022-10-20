
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
			System.out.println("öðretmen ve ders bölümleri uyuþmuyor");
		}

		// printTeacherInfo();
	}

	void printTeacherInfo() {
		teacher.print();
	}

}
