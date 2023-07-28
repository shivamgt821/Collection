import java.util.HashMap;
import java.util.Map;

public class HashMapTricky2 {
	
public static void main(String[] args) {
	Map<String, Integer> forestSpecies = new HashMap<>();

	forestSpecies.put("Amazon", 30000);
	forestSpecies.put("Congo", 10000);
	forestSpecies.put("Daintree", 15000);
	forestSpecies.put("Amazon", 40000);

	int forestCount = forestSpecies.size();
	System.out.println(forestCount);
}

}
