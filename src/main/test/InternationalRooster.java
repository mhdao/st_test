package test;

import java.util.HashMap;
import java.util.Map;

public class InternationalRooster extends Rooster {

	Map<String, String> languageMap = new HashMap<>();
	public InternationalRooster() {
		this.languageMap.put("Danish", "kykyliky");
		this.languageMap.put("Dutch", "kukeleku");
		this.languageMap.put("Finnish", "kukko kiekuu");
		this.languageMap.put("French", "cocorico");
		this.languageMap.put("German", "kikeriki");
		this.languageMap.put("Greek", "kikiriki");
		this.languageMap.put("Hebrew", "coo-koo-ri-koo");
		this.languageMap.put("Hungarian", "kukuriku");
		this.languageMap.put("Italian", "chicchirichi");
		this.languageMap.put("Japanese", "ko-ke-kok-ko-o");
		this.languageMap.put("Portuguese", "cucurucu");
		this.languageMap.put("Russian", "kukareku");
		this.languageMap.put("Swedish", "kuckeliku");
		this.languageMap.put("Turkish", "kuk-kurri-kuuu");
		this.languageMap.put("Urdu", "kuklooku");
	}
	void sing(String language) {
		if (language != null) {
			word = this.languageMap.get(language);
		} 
		super.sing();
	}
	public static void main(String[] args) {
		InternationalRooster rooster = new InternationalRooster();
		rooster.sing("German");
		rooster.sing();
	}
}

