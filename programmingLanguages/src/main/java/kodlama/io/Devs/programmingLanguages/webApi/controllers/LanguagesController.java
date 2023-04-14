package kodlama.io.Devs.programmingLanguages.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.programmingLanguages.business.abstracts.LanguageService;
import kodlama.io.Devs.programmingLanguages.entities.concretes.Language;

@RestController  //annotation
@RequestMapping("/api/languages")
public class LanguagesController {
	 private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getall")	
	public List<Language> getAll(){
		 return languageService.getall();
	 }
}
