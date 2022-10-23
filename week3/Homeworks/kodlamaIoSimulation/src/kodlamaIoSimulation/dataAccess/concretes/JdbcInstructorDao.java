package kodlamaIoSimulation.dataAccess.concretes;

import kodlamaIoSimulation.dataAccess.abstracts.InstructorDao;
import kodlamaIoSimulation.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName() + " JDBC veritabanýna eklendi");

	}

}
