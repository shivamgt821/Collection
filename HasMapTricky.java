import java.util.HashMap;   
	import java.util.Iterator;
	import java.util.Set;

	public class HasMapTricky {

		public static void main(String[] args) {
			
			HashMap<String,Integer> instruments = new HashMap<String,Integer>();
			instruments.put("Guitar", 1200);
			instruments.put("Cello", 3000);
			instruments.put("drum", 2000);
			instruments.put("Cello", 4500);
			
			System.out.println(instruments.size());// 3 HashMap can store duplicate key but can't value
			System.out.println(instruments);
			
			}
		}

