import java.util.Arrays;

public class TestEmployee {

	public static void main(String[] args) {
		Employee[] arr = {
				new Employee("Shivam" , 50000),
				new Employee("Joyson" , 60000),
				new Employee("Kishor" , 80000),
				new Employee("Ravish" , 150000),
				new Employee("Greeshma" ,65000)
		};
		
		Arrays.sort(arr);
		for(Employee e : arr)
		System.out.println(e);
	}

}
