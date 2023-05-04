import java.util.HashMap;

public class Map_Intro {

	public static void main(String[] args) {
//		HashMap myDetails = new HashMap();
		HashMap<String , String> myDetails = new HashMap<String , String>();
		
//		System.out.println(myDetails);       // {}
		
//		System.out.println(myDetails.put("FirstName" , "Shivam"));  //  null because first table was empty if i enter the key and value is goes to entered  and null has been printed
//		System.out.println(myDetails.put("FirstName" , "Suraj"));   // Shivam because first put() method check same key value present or not if present then print old value
	
		myDetails.put("FirstName" , "Shivam");
		myDetails.put("FirstName" , "Suraj");
		myDetails.put("SurName" , "Suraj");
		myDetails.put("PhoneNumber", "9304282873");
		myDetails.put("Password", "##90$$");
		myDetails.put("D.O.B", "15-07-1999");
		myDetails.put("Gender", "Male");
		System.out.println(myDetails.size());  //6
		System.out.println(myDetails.isEmpty()); // false 

//		System.out.println(myDetails);       // FirstName=Shivam
		
		System.out.println(myDetails.get("FirstName"));
		System.out.println(myDetails.get("LastName"));  // null
		System.out.println(myDetails.get("SurName"));  
	}

}
