package kodlamaiohw.ProgrammingLanguages.webApi.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaiohw.ProgrammingLanguages.business.abstracts.LanguageService;
import kodlamaiohw.ProgrammingLanguages.entities.Language;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {

	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {

		this.languageService = languageService;
	}

	@GetMapping("/getall")
	public List<Language> getAll() {
		return languageService.getAll();
	}

	 @GetMapping("/getbyid/{id}")
	public Language getById(@PathVariable int id) {
		return languageService.getById(id);

	}

	@PostMapping("/add")
	public void add(@RequestBody Language language) throws Exception {
		languageService.add(language);

	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable int id) {
		languageService.delete(id);

	}

	@PutMapping("/update")
	public void update(@RequestBody Language language,int id) throws Exception {
		languageService.update(language,id);

	}

}
