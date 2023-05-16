public class Student implements  Comparable {
	
	String name;
	public Student(String n) {
		name = n;
	}
	
	public String toString() {
		return "Student[name = "+name+ "]";
	}
	public int compareTo(Object args) {
		Student s = (Student)args;
		return name.compareTo(s.name);
	}

}
