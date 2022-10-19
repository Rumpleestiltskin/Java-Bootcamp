package kodlamaioSimulation.entities;

public class Course {

	private String name;
	private String instructor;
	private double price;
	private String courseCategory;

	public Course() {

	}

	public Course(String name, String instructor, double price, String courseCategory) {

		this.name = name;
		this.instructor = instructor;
		this.price = price;
		this.courseCategory = courseCategory;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getCourseCategory() {
		return courseCategory;
	}

	public void setCourseCategory(String courseCategory) {
		this.courseCategory = courseCategory;
	}

}
