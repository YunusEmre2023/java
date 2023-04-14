package kodlama.io.Devs.programmingLanguages.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.Devs.programmingLanguages.business.abstracts.LanguageService;
import kodlama.io.Devs.programmingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.programmingLanguages.entities.concretes.Language;


@Service //bu sınıf bir business nesnesidir
public class LanguageManager implements LanguageService{
	private LanguageRepository languageRepository;
	

	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}


	@Override
	public List<Language> getall() {
		// TODO Auto-generated method stub
		//iş kuralları;
		return languageRepository.getall();
	}
	
}
