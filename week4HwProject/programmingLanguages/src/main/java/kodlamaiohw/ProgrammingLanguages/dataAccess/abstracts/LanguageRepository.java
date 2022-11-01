package kodlamaiohw.ProgrammingLanguages.dataAccess.abstracts;

import java.util.List;


import kodlamaiohw.ProgrammingLanguages.entities.Language;

public interface LanguageRepository {
	
	List<Language> getAll();
	
	Language getById(int id);
	
	void add(Language language);
	
	void delete(int id);
	
	void update(Language language, int id);
	
	
	
	

}
