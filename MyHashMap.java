import java.util.HashMap;  
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MyHashMap {

	public static void main(String[] args) {
//		HashMap<String, String> flights = new HashMap<String,String>();
		TreeMap<String, String> flights = new TreeMap<String,String>();
//		LinkedHashMap<String, String> flights = new LinkedHashMap<String,String>();
		flights.put("21:00", "indigo");
		flights.put("23:30", "goair");
		flights.put("04:30", "spicejet");
		flights.put("16:00", "vistara");
		flights.put("21:30", "airindia");
		flights.put("09:00", "indigo");
		flights.put("11:00", "spicejet");
		flights.put("13:00", "goair");
		
		System.out.println(flights);
		
		Set<Entry<String, String>> entrys = flights.entrySet();
		for(Entry<String,String> entry:entrys) {
			System.out.println(entry);
		}
		
		System.out.println(flights.firstKey()); //04:30
		System.out.println(flights.lastKey());//23:30
		System.out.println(flights.firstEntry()); //04:30=spicejet
		System.out.println(flights.lastEntry());//23:30=goair
		
		System.out.println(flights.ceilingKey("10:00"));  // Near Key print
		System.out.println(flights.ceilingEntry("10:00")); // Near key details print
		
		System.out.println(flights.ceilingKey("11:00"));//11:00 
		System.out.println(flights.ceilingEntry("11:00"));//11:00=spicejet
		
		System.out.println(flights.floorKey("10:00")); //09:00
		System.out.println(flights.floorEntry("10:00"));//09:00=indigo
		
		System.out.println(flights.higherKey("10.00"));// 11.00
		System.out.println(flights.higherEntry("10.00")); // 11:00=spicejet

		System.out.println(flights.higherKey("11.00"));// 11.00
		System.out.println(flights.higherEntry("11.00"));// 
		
		System.out.println(flights.floorKey("21:00"));//21:00
		System.out.println(flights.floorEntry("21:00")); //21:00=indigo
		
		System.out.println(flights.lowerKey("21:00"));//16:00		
		System.out.println(flights.lowerEntry("21:00"));//16:00=vistara   --> Give the result of Just before of given key
		
	}

}
