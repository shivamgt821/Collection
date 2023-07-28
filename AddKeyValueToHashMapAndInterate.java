import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AddKeyValueToHashMapAndInterate {

	public static void main(String[] args){
		
		HashMap<String,String> flights = new HashMap<String,String>();
		
		flights.put("21:00", "indigo");
		flights.put("23:30", "goair");
		flights.put("04:30", "spicejet");
		flights.put("16:00", "vistara");
		flights.put("21:30", "airindia");
		flights.put("09:00", "indigo");
		flights.put("11:00", "spicejet");
		flights.put("13:00", "goair");
		
		System.out.println(flights);
		
		Set s = flights.keySet();
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Object k = i.next();
			String v = flights.get(k);
			System.out.println(k+"="+v);
		}
		
		
		}
	}
