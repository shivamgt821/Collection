import java.util.Arrays;   
import java.util.Comparator;

public class CompDemo {
	
	public static void main(String[] args) {
		Employee arr[] = {
				new Employee("Raju", 44587),
				new Employee("Sandeep", 195600),
				new Employee("Kishore", 660000),
				new Employee("Joy", 300097),
				new Employee("Tanya", 29000),
		};
		
		Arrays.sort(arr,new Comp());
		for(Employee e: arr)
			System.out.println(e);
	}

}

class Comp implements Comparator {
	
	public int compare(Object arg1, Object arg2) {
		
		Employee e1 = (Employee)arg1;
		Employee e2 = (Employee)arg2;
		
		if(e1.sal>e2.sal) return 1;
		if(e1.sal<e2.sal) return -1;
		return 0;
	}	
}
