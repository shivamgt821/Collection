import java.util.Arrays;  
import java.util.Comparator;

public class String_Acc_To_Size {

	public static void main(String[] args) {

		String a [] = {"Jspiders", "Capgemini", "MasterCard", "Infosys","Tcs", "Dell","Wipro"};
		Arrays.sort(a,new LenComp());
		for(String s:a) {
			System.out.println(s);
		}
	
	}

}

class LenComp implements Comparator {
	
	public int compare(Object arg1, Object arg2) {
		String s1 = (String)arg1;
		String s2 = (String)arg2;
		return s1.length()-s2.length();
	}
}
