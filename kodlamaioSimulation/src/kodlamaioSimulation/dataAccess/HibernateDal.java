package kodlamaioSimulation.dataAccess;

import java.util.ArrayList;

import kodlamaioSimulation.entities.Category;
import kodlamaioSimulation.entities.Course;

public class HibernateDal implements BaseDal {

	ArrayList<Course> courseName = new ArrayList<>();
	ArrayList<Category> categoryName = new ArrayList<>();

	@Override
	public void add(Course course) {
		// hibernate kodları
		courseName.add(course);
		System.out.println("Kurs Hibernate ile eklendi");

	}

	@Override
	public void addCat(Category category) {
		// hibernate kodları
		categoryName.add(category);
		System.out.println("Kategori Hibernate ile eklendi");

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
