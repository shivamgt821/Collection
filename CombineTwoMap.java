import java.util.HashMap; 
import java.util.Set;

public class CombineTwoMap {

	public static void main(String[] args) {
		HashMap<String,String>myDetails = new HashMap<String,String>();
		myDetails.put("FirstName", "Sommanna");
		myDetails.put("SurName", "Sommanna");
		myDetails.put("Phone number", "(9304282873");
		myDetails.put("Password", "##90$$");
		myDetails.put("DOB", "20/4/1947");
		myDetails.put("Gender", "Male");
		
		HashMap<String,String>myData = new HashMap<String,String>();
		myData.put("Email", "Sommanna821@gmail.com");
		myData.put("Country", "India");
		myData.put("Blood Group", "O+");
		
		System.out.println(myDetails);

//		Set<String> keys = myData.keySet();
//		for(String key : keys) {
//			String value = myData.get(key);
//			myDetails.put(key, value);
//		}
		
		myDetails.putAll(myData);
		
		System.out.println(myDetails);

	}

}
