package kodlamaIoSimulation;

import kodlamaIoSimulation.business.concretes.CategoryManager;
import kodlamaIoSimulation.business.concretes.CourseManager;
import kodlamaIoSimulation.business.concretes.InstructorManager;
import kodlamaIoSimulation.coreLogging.DatabaseLogger;
import kodlamaIoSimulation.coreLogging.FileLogger;
import kodlamaIoSimulation.coreLogging.Logger;
import kodlamaIoSimulation.coreLogging.MailLogger;
import kodlamaIoSimulation.dataAccess.concretes.HibernateCategoryDao;
import kodlamaIoSimulation.dataAccess.concretes.JdbcCourseDao;
import kodlamaIoSimulation.dataAccess.concretes.JdbcInstructorDao;
import kodlamaIoSimulation.entities.Category;
import kodlamaIoSimulation.entities.Course;
import kodlamaIoSimulation.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1 = new Course(1, "C#", 1000);
		Course course2 = new Course(2, "C# 2", 10000);
		Course course3 = new Course(3, "C# 4", 100000);
		Instructor instructor = new Instructor(100, "Engin", " Demiroð");
		Category category = new Category(10, "Software");
		Course[] courses = { course1, course2, course3 };
		Logger[] loggers = { new DatabaseLogger(), new MailLogger(), new FileLogger() };
		CourseManager manager = new CourseManager(new JdbcCourseDao(), courses, loggers);
		manager.add(course1);
		manager.add(course2);
		manager.add(course3);
		InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao());
		instructorManager.add(instructor);
		CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao());
		categoryManager.add(category);

	}

}
