/*
Karl wants to keep track of a list of languages to learn on Exercism's website. Karl needs to be able to add new languages, 
remove old ones and check if certain languages are in the list. It would be very exciting if Karl wants to learn Java or Kotlin!

*/ 
import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        int result = languages.size();
        if (result == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public void addLanguage(String language) {
        languages.add(language);
        
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        String result = languages.get(0);
        return result;
    }

    public int count() {
        int result = languages.size();
        return result;
    }

    public boolean containsLanguage(String language) {
        boolean result = languages.contains(language);
        return result;
    }

    public boolean isExciting() {
        boolean result = languages.contains("Java");
        boolean result2 = languages.contains("Kotlin");
        if (result == true){
            return true;
        }
        else if (result2 == true){
            return true;
        }
        else {
            return false;
        }
    }
}

// OPINION: it was easy to do, it takes only a couple minutes.