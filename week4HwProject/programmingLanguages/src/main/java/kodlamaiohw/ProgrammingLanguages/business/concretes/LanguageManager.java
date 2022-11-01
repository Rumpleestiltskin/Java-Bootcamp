package kodlamaiohw.ProgrammingLanguages.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaiohw.ProgrammingLanguages.business.abstracts.LanguageService;
import kodlamaiohw.ProgrammingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlamaiohw.ProgrammingLanguages.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;
	

	public LanguageManager(LanguageRepository languageRepository) {

		this.languageRepository = languageRepository;
		
	}

	@Override
	public List<Language> getAll() {
		return languageRepository.getAll();

	}

	@Override
	public Language getById(int id) {

		return languageRepository.getById(id);
	}

	@Override
	public void add(Language language) throws Exception {
		if (language.getId() <= 0) {
			throw new Exception("Id 0 veya daha küçük olamaz!");
		}

		if (language.getName().length() == 0) {
			throw new Exception("Dil ismi girmek zorundasınız!");
		}

		if (checkName(language.getName())) {
			throw new Exception("Bu dil ismi zaten mevcut!");

		}

		if (checkId(language.getId())) {
			throw new Exception("Id'ler aynı olamaz!");
		}

		languageRepository.add(language);
		System.out.println("Yeni dil eklendi!");

	}

	@Override
	public void delete(int id) {
		languageRepository.delete(id);
		System.out.println("Dil silindi!");

	}

	@Override
	public void update(Language language,int id) throws Exception {
		if(checkName(language.getName()))
			throw new Exception("Zaten var olan bir dile güncelleyemezsiniz!");
		languageRepository.update(language,id);
		System.out.println("Dil/Id güncellendi!");

	}
	
	public boolean checkName(String name) {
		// name check
		for (Language language : getAll()) {
			if (language.getName().equalsIgnoreCase(name)) {
				return true;
			}

		}
		return false;
	}

	public boolean checkId(int id) {
		// check id
		for (Language languageId : getAll()) {
			if (languageId.getId() == id) {
				return true;
			}

		}
		return false;
	}

}
