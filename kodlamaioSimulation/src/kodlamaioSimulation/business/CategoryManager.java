package kodlamaioSimulation.business;

import kodlamaioSimulation.core.logging.BaseLogger;
import kodlamaioSimulation.dataAccess.BaseDal;
import kodlamaioSimulation.entities.Category;

public class CategoryManager {

	private BaseLogger[] loggers;
	private BaseDal dataAccess;

	public CategoryManager() {

	}

	public CategoryManager(BaseDal dataAccess, BaseLogger[] loggers) {

		this.loggers = loggers;
		this.dataAccess = dataAccess;
	}

	public void add(Category category) throws Exception {
		if (dataAccess.check(category.getName())) {
			throw new Exception("Böyle bir kategori zaten mevcut");
		}

		dataAccess.addCat(category);

		for (BaseLogger baseLogger : loggers) {
			baseLogger.log(category.getName());

		}
	}

}
