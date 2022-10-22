package kodlamaIoSimulation;

import kodlamaIoSimulation.business.concretes.CourseManager;
import kodlamaIoSimulation.dataAccess.concretes.JdbcCourseDao;
import kodlamaIoSimulation.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "C#", 1000);
		CourseManager manager = new CourseManager(new JdbcCourseDao());
		manager.add(course1);

	}

}
