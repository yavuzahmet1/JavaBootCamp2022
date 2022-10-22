package kodlamaIoSimulation.business.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.CourseDao;
import kodlamaIoSimulation.entities.Course;

public class CourseManager {
	private CourseDao courseDao_;

	public CourseManager(CourseDao courseDao) {

		courseDao_ = courseDao;
	}

	public void add(Course course) throws Exception {
		if (course.getPrice() < 10) {
			throw new Exception("Kurs 10 liradan az olamaz");
		}
		courseDao_.add(course);

	}

}
