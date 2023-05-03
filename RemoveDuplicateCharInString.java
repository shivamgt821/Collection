import java.util.LinkedHashSet;  
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter any String");
		String S = scn.nextLine();
		Set<Character> s = new LinkedHashSet<Character>();
		for(int i=0; i<S.length();i++) {
			s.add( S.charAt(i));
		}
		System.out.println(s);
	}

}
