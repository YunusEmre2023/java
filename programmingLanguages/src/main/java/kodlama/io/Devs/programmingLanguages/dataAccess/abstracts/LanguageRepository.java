package kodlama.io.Devs.programmingLanguages.dataAccess.abstracts;

import java.util.List;



import kodlama.io.Devs.programmingLanguages.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getall();
	
}
