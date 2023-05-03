import java.util.TreeMap;

public class AlphaTreemap {

	public static void main(String[] args) {
		TreeMap<Integer, String> t = new TreeMap<Integer,String>();
		t.put(11, "audi");
//		t.put(null, null);    // java.lang.NullPointerException
		t.put(11, "bmw");
		t.put(12, null);
		
//		System.out.println(t.size());
		System.out.println(t.firstEntry());
		
	}

}
