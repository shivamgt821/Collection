import java.util.HashMap;

public class Map_Intro_Built_In {

	public static void main(String[] args) {
		HashMap<String , String> myDetails1 = new HashMap<String , String>();
		
		myDetails1.put("FirstName" , "Shivam");
		myDetails1.put("FirstName" , "Suraj");
		myDetails1.put("SurName" , "Suraj");
		myDetails1.put("PhoneNumber", "9304282873");
		myDetails1.put("Password", "##90$$");
		myDetails1.put("D.O.B", "15-07-1999");
		myDetails1.put("Gender", "Male");
		System.out.println(myDetails1.size());  //6
		System.out.println(myDetails1.isEmpty()); // false
		System.out.println(myDetails1.containsKey("Password")); // true
		System.out.println(myDetails1.containsKey("LastName")); // false
		System.out.println(myDetails1.containsKey("SurName")); // true
		System.out.println(myDetails1.containsValue("9304282873")); // true
		System.out.println(myDetails1.containsValue("Female")); // false
		System.out.println(myDetails1.containsValue("Suraj")); // true    
		
		System.out.println(myDetails1);  // {FirstName=Suraj, PhoneNumber=9304282873, Gender=Male, SurName=Suraj, D.O.B=15-07-1999, Password=##90$$}
		System.out.println(myDetails1.remove("SurName")); 
		System.out.println(myDetails1); //{FirstName=Suraj, PhoneNumber=9304282873, Gender=Male, D.O.B=15-07-1999, Password=##90$$}
		System.out.println(myDetails1.remove("LastName"));  // null
		
		System.out.println(myDetails1.remove("FirstName", "Shivam")); // false
		System.out.println(myDetails1.remove("FirstName", "Suraj")); // true
		System.out.println(myDetails1); // {PhoneNumber=9304282873, Gender=Male, D.O.B=15-07-1999, Password=##90$$}




	}

}
