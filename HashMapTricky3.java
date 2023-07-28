import java.util.HashMap;

	public class HashMapTricky3 {
	    public static void main(String[] args) {
	        HashMap<String, Integer> pantry = new HashMap<>();

	        pantry.put("Apples", 3);
	        pantry.put("Oranges", 2);

	        int currentApples = pantry.get("Apples");
	//        System.out.println(currentApples);
	        pantry.put("Apples", currentApples + 4);   // update apple value because hashmap allow duplicate key not value

	        System.out.println(pantry.get("Apples"));
	        System.out.println(pantry.get("Oranges"));
	    }
	}


