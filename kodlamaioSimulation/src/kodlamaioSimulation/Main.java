package kodlamaioSimulation;

import kodlamaioSimulation.business.CategoryManager;
import kodlamaioSimulation.business.CourseManager;
import kodlamaioSimulation.core.logging.BaseLogger;
import kodlamaioSimulation.core.logging.DatabaseLogger;
import kodlamaioSimulation.core.logging.FileLogger;
import kodlamaioSimulation.dataAccess.HibernateDal;
import kodlamaioSimulation.dataAccess.JdbcDal;
import kodlamaioSimulation.entities.Category;
import kodlamaioSimulation.entities.Course;

public class Main {

	public static void main(String[] args) throws Exception {

		BaseLogger[] loggers = { new DatabaseLogger(), new FileLogger() };

		Course course1 = new Course();
		course1.setName("Java");
		course1.setCourseCategory("Programming");
		course1.setInstructor("Engin");
		course1.setPrice(100);

		CourseManager courseManager = new CourseManager(new JdbcDal(), loggers);
		courseManager.add(course1);

		Course course2 = new Course();
		course2.setName("Python");
		course2.setInstructor("Engin");
		course2.setCourseCategory("Programming");
		course2.setPrice(50);

		courseManager.add(course2);

		Category category1 = new Category("Programming");
		CategoryManager categoryManager = new CategoryManager(new JdbcDal(), loggers);

		Category category2 = new Category("Programming2");
		categoryManager.add(category1);
		categoryManager.add(category2);

	}

}
