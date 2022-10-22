package kodlamaIoSimulation.dataAccess.abstracts;

import java.util.List;

import kodlamaIoSimulation.entities.Base;

public interface BaseDao {
	void add(Base base);

	List<Base> getAll();

}
