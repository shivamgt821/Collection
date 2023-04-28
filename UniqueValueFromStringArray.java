	import java.util.LinkedHashSet;
	import java.util.Set;

	public class UniqueValueFromStringArray {

		public static void main(String[] args) {
			String a[]= {"ramesh","suresh","mohan","raju","ejdvb", "wdjv"};
			String b[]= {"ramesh","karma","mona","raju", "surya"};
			Set <String> s = new LinkedHashSet<String>();
			
			for(int i=0; i<a.length; i++) {
				s.add(a[i]);
				
			}
			for(int j=0; j<b.length; j++) {
				s.add(b[j]);
			}
			System.out.println(s);
			
		}
}
