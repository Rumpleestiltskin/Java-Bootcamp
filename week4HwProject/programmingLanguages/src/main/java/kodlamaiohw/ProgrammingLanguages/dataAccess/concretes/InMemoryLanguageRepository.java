package kodlamaiohw.ProgrammingLanguages.dataAccess.concretes;

import java.util.ArrayList;

import java.util.List;

import org.springframework.stereotype.Repository;

import kodlamaiohw.ProgrammingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlamaiohw.ProgrammingLanguages.entities.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;

	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "Python"));
		languages.add(new Language(2, "Java"));
		languages.add(new Language(3, "C#"));

	}

	@Override
	public List<Language> getAll() {

		return languages;
	}

	@Override
	public Language getById(int id) {
		for (Language language : languages) {
			if (language.getId() == id) {
				return language;
			}

		}

		return null;
	}

	@Override
	public void add(Language language) {
		languages.add(language);

	}

	@Override
	public void delete(int id) {
		getAll().remove(getById(id));
		
		
		/*
		 * for (Language language : languages) { if (language.getId() == id) {
		 * 
		 * languages.remove(language); }
		 * 
		 * }
		 */
	}

	@Override
	public void update(Language language, int id) {
		getById(id).setName(language.getName());

	}

}
