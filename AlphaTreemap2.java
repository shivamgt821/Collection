import java.util.TreeMap;

public class AlphaTreemap2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> obj = new TreeMap<String, Integer>();
		obj.put("C", new Integer(1));
		obj.put("B", new Integer(2));
		obj.put("A", new Integer(3));
		obj.put("C", new Integer(3));
		
		System.out.println(obj);
		System.out.println(obj.lastEntry());
		System.out.println(obj.size());
	}

}
