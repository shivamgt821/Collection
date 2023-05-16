public class TestStudent1 {

	public static void main(String[] args) {
		Student s1 = new Student("SHIVAM");
		Student s2 = new Student("SURYA");
		
		int res = s1.compareTo(s2);
		System.out.println(res);
		
	}

}
