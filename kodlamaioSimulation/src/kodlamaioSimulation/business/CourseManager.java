package kodlamaioSimulation.business;

import kodlamaioSimulation.core.logging.BaseLogger;
import kodlamaioSimulation.dataAccess.BaseDal;
import kodlamaioSimulation.entities.Course;

public class CourseManager {

	private BaseLogger[] loggers;
	private BaseDal dataAccess;

	public CourseManager() {

	}

	public CourseManager(BaseDal dataAccess, BaseLogger[] loggers) {

		this.loggers = loggers;
		this.dataAccess = dataAccess;
	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Fiyat 0'dan küçük olamaz.");
		}
		if (dataAccess.check(course.getName())) {
			throw new Exception("Kurs ismi aynı olamaz.");
		}

		dataAccess.add(course);

		for (BaseLogger baseLogger : loggers) {
			baseLogger.log(course.getName());

		}
	}

}
