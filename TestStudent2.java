import java.util.Arrays;

public class TestStudent2 {

	public static void main(String[] args) {

		Student [] arr = {
				new Student("Arijit Singh"),
				new Student("Mohit Raina"),
				new Student("Rohit Sharma"),
				new Student("Dhoni"),
				new Student("Shreya Ghoshal"),
		};
		
		Arrays.sort(arr);
		for(Student stu :arr) System.out.println(stu);
	}

}
