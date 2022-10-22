package kodlamaIoSimulation.dataAccess.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.CourseDao;
import kodlamaIoSimulation.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi");

	}

}
