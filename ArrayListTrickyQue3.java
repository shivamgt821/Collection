import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.List;


	public class ArrayListTrickyQue3 {

	    public static void main(String[] args) {
	        List<String> list = new ArrayList<String>(Arrays.asList("a", "b", "c"));
	        for(String value :list) { // Modifying a collection while iterating through it can throw a ConcurrentModificationException.
	            if(value.equals("a")) {
	                list.remove(value);
	            }
	        }
	        System.out.println(list); // outputs [b,c]
	    }
	}
