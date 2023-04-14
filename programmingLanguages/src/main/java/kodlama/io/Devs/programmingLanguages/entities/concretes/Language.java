package kodlama.io.Devs.programmingLanguages.entities.concretes;

public class Language {
	private String langName;
	private int id;
	
	
	public Language() {

	}


	public Language(String langName, int id) {
		
		this.langName = langName;
		this.id = id;
	}


	public String getLangName() {
		return langName;
	}


	public void setLangName(String langName) {
		this.langName = langName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
}
