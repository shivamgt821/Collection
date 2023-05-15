public class Employee implements Comparable {
	
	String name;
	double sal;
	
	public Employee(String n, double s) {
		this.name = n;
		this.sal = s;
	}
	
	public String toString() {
		return "Emp[name = "+name+ ", sal = "+sal+"]";
	}
	
	public int compareTo(Object args) {
		Employee e = (Employee)args;
		
		// return name.compareTo(e.name);  // sorted according to name 
		
		if(sal > ((Employee)e).sal) return 1;
		if(sal < ((Employee)e).sal) return -1; // 
		return 0;
	}
	
	
	
}
