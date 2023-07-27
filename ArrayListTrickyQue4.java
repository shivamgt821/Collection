import java.util.ArrayList;
import java.util.List;

public class ArrayListTrickyQue4 {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");

		List<String> list2 = new ArrayList<>();
		list2.add("Two");

		list1.remove(list2);
		System.out.println(list1);
	}
}
