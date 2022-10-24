package kodlamaIoSimulation.business.concretes;

import kodlamaIoSimulation.coreLogging.Logger;
import kodlamaIoSimulation.dataAccess.abstracts.CourseDao;
import kodlamaIoSimulation.entities.Course;

public class CourseManager {
	private CourseDao courseDao_;
	private Logger[] loggers_;
	private Course[] courses_;

	public CourseManager(CourseDao courseDao, Course[] courses, Logger[] loggers) {

		courseDao_ = courseDao;
		courses_ = courses;
		loggers_ = loggers;
	}

	public void add(Course course) throws Exception {
		/*
		 * for (Course c : courses_) { if (c.getName().equals(course.getName())) { throw
		 * new Exception("Kurs ismi tekrar edemez."); }
		 * 
		 * }
		 */
		if (course.getPrice() < 10) {
			throw new Exception("Kurs 10 liradan az olamaz");
		}
		courseDao_.add(course);
		for (Logger log : loggers_) {
			log.log(course.getName());
		}

	}

}
