package kodlama.io.Devs.programmingLanguages.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.programmingLanguages.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.programmingLanguages.entities.concretes.Language;

@Repository //bu sınıf bir dataaccess nesnesidir
public class InMemoryLanguageRepository implements LanguageRepository{

	List<Language> languages;
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language("Python",1));
		languages.add(new Language("C#",2));
		languages.add(new Language("Java",3));
		languages.add(new Language("C",4));
		languages.add(new Language("C++",5));
		languages.add(new Language("Yarrağımın Başı",6));
		
	}
	public List<Language> getall() {
		// TODO Auto-generated method stub
		return languages;
	}
}
		
	
	
		

