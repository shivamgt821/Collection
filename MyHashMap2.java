import java.util.Set;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class MyHashMap2 {

	public static void main(String[] args) {
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
		
		Set<Entry<String, String>> entrys = flights.entrySet();
		for(Entry<String,String> entry:entrys) {
			System.out.println(entry);
		}
		System.out.println();
		
		Set<String> keys = flights.descendingKeySet();
		for(String key:keys) {
			System.out.println(key);  // 23:30 21:30 21:00 16:00 13:00 11:00 09:00 04:30
		}
		System.out.println();
		
		Map <String,String> flights2 = flights.descendingMap();
//		System.out.println(flights2.entrySet());
		Set<Entry<String, String>> set = flights2.entrySet();
		for(Entry<String,String> entry:set) {
			System.out.println(entry);  // descending order
		}
		
		System.out.println();
		
		System.out.println(flights.headMap("13:00")); // this is exclusive {04:30=spicejet, 09:00=indigo, 11:00=spicejet}
		
		System.out.println(flights.headMap("13:00", false)); // same output if bolean value is false {04:30=spicejet, 09:00=indigo, 11:00=spicejet} 
		
		System.out.println(flights.headMap("13:00", true)); // this is inclusive --> {04:30=spicejet, 09:00=indigo, 11:00=spicejet, 13:00=goair}
		
		System.out.println(flights.tailMap("13:00")); // print that key to last value-->{13:00=goair, 16:00=vistara, 21:00=indigo, 21:30=airindia, 23:30=goair}
		
		System.out.println(flights.tailMap("13:00", false)); // this is exclusive.Print after that key to last-->{16:00=vistara, 21:00=indigo, 21:30=airindia, 23:30=goair}
		
		System.out.println(flights.tailMap("13:00", true));//this is inclusive .print that key to last value-->{13:00=goair, 16:00=vistara, 21:00=indigo, 21:30=airindia, 23:30=goair}

		System.out.println(flights.subMap("11:00", "21:00"));// Starting key is inclusive and last key is exclusive this give range between both key -->{11:00=spicejet, 13:00=goair, 16:00=vistara}
		
		System.out.println(flights.subMap("11:00", false, "21:00", false)); // Both keys are exlusive -->{13:00=goair, 16:00=vistara}
 
		System.out.println(flights.subMap("11:00", false, "21:00", true));// first key is exlusive and last is inclusive -->{13:00=goair, 16:00=vistara, 21:00=indigo}
		
		System.out.println(flights.subMap("11:00",true , "21:00", true));// both key inclusive -->{11:00=spicejet, 13:00=goair, 16:00=vistara, 21:00=indigo}

//		System.out.println(flights.pollFirstEntry());// remove first element and return and print it -->04:30=spicejet
//		System.out.println(flights.pollLastEntry()); // remove last element and return and print it --> 13:00=//goair

//		flights.pollFirstEntry();
//		System.out.println();
//		for(Entry <String,String> entry2:entrys) {
//			System.out.println(entry2); // remove first and all print -->09:00=indigo11:00=spicejet13:00=goair16:00=vistara21:00=indigo21:30=airindia23:30=goair
//		}
		
		flights.pollLastEntry();
		System.out.println();
		for(Entry <String,String> entry3:entrys) {
			System.out.println(entry3); // remove Last and all print -->09:00=indigo11:00=spicejet13:00=goair16:00=vistara21:00=indigo21:30=airindia
		}		
		
//		System.out.println();flights.pollLastEntry();
		
		}
  }
