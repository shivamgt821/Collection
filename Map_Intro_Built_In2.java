import java.util.HashMap;
import java.util.Scanner;

public class Map_Intro_Built_In2 {

	public static void main(String[] args) {
		HashMap<String , String> myDetails = new HashMap<String , String>();
		
		myDetails.put("FirstName" , "Shivam");
		myDetails.put("FirstName" , "Suraj");
		myDetails.put("SurName" , "Suraj");
		myDetails.put("PhoneNumber", "9304282873");
		myDetails.put("Password", "##90$$");
		myDetails.put("D.O.B", "15-07-1999");
		myDetails.put("Gender", "Male");
		System.out.println(myDetails);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Key :");
		String key = scan.next();
		System.out.println("Enter any Value :");
		String value = scan.next();
		
//		if(myDetails.containsKey(key)==false) {
//			myDetails.put(key, value);
//		}
		myDetails.putIfAbsent(key, value);  // Same Result 
		System.out.println(myDetails);
		
	}
}
