import java.util.HashMap;
import java.util.Map;

public class PangramChecker {
  public boolean check(String sentence){
    // Sacrificing memory complexity in order to use useful Map functions
	  Map<Character, Integer> mapABC = new HashMap<>();
    // Number of letters of the ENG's alphabet
    final int NUM_LETTERS = 26;
	  for(char s: sentence.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray()){
		  if (!mapABC.containsKey(s))
			  mapABC.put(s, 0);      
    }
	  return mapABC.entrySet().size() == NUM_LETTERS;
  }
}
