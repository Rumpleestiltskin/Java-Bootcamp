package kodlamaiohw.ProgrammingLanguages.business.abstracts;

import java.util.List;

import kodlamaiohw.ProgrammingLanguages.entities.Language;

public interface LanguageService {
	
	List<Language> getAll();
	
	Language getById(int id);
	
	void add(Language language) throws Exception;
	
	void delete(int id);
	
	void update(Language language,int id) throws Exception;
	
	boolean checkName(String name);
	
	boolean checkId(int id);

}
