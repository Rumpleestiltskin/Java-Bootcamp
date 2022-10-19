package kodlamaioSimulation.dataAccess;

import java.util.ArrayList;

import kodlamaioSimulation.entities.Category;
import kodlamaioSimulation.entities.Course;

public class JdbcDal implements BaseDal {

	ArrayList<Course> courseName = new ArrayList<>();
	ArrayList<Category> categoryName = new ArrayList<>();

	@Override
	public void add(Course course) {
		// jdbc kodları
		courseName.add(course);
		System.out.println("Kurs Jdbc ile eklendi");

	}

	@Override
	public void addCat(Category category) {
		// jdbc kodları
		categoryName.add(category);
		System.out.println("Kategori Jdbc ile eklendi");

	}

	@Override
	public boolean check(String name) {

		for (Category category : categoryName) {
			if (category.getName().equalsIgnoreCase(name)) {
				return true;
			}

		}

		for (Course course : courseName) {
			if (course.getName().equalsIgnoreCase(name)) {
				return true;
			}

		}
		return false;

	}

}
