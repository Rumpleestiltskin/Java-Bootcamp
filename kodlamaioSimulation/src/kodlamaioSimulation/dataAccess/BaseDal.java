package kodlamaioSimulation.dataAccess;

import kodlamaioSimulation.entities.Category;
import kodlamaioSimulation.entities.Course;

public interface BaseDal {

	void add(Course course);

	void addCat(Category category);

	boolean check(String name);

}
