import java.util.HashMap;
import java.util.Map;

public class Welcome {
   private static final Map<String, String> LANGUAGE_DICTIONARY = init();
   
   private static Map<String, String> init(){
      Map<String, String> dictionary = new HashMap<>();
      dictionary.put("english", "Welcome");
      dictionary.put("czech", "Vitejte");
      dictionary.put("danish", "Velkomst");
      dictionary.put("dutch", "Welkom");
      dictionary.put("estonian", "Tere tulemast");
      dictionary.put("finnish", "Tervetuloa");
      dictionary.put("flemish", "Welgekomen");
      dictionary.put("french", "Bienvenue");
      dictionary.put("german", "Willkommen");
      dictionary.put("irish", "Failte");
      dictionary.put("italian", "Benvenuto");
      dictionary.put("latvian", "Gaidits");
      dictionary.put("lithuanian", "Laukiamas");
      dictionary.put("polish", "Witamy");
      dictionary.put("spanish", "Bienvenido");
      dictionary.put("swedish", "Valkommen");
      dictionary.put("welsh", "Croeso");
      return dictionary;
   }
   
   public static String greet(String language){
      return LANGUAGE_DICTIONARY.getOrDefault(language, "Welcome");
   }
}
