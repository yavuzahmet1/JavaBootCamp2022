package kodlamaIoSimulation.business.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.InstructorDao;
import kodlamaIoSimulation.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao_;

	public InstructorManager(InstructorDao instructorDao) {

		instructorDao_ = instructorDao;
	}

	public void add(Instructor instructor) throws Exception {
		if (instructor.getName() == "a") {
			throw new Exception("a olmaz");
		}
		instructorDao_.add(instructor);

	}

}
