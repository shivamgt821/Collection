import java.util.HashMap;

public class replacemethod2 {

	public static void main(String[] args) {
		HashMap<String,String>myDetails = new HashMap<String,String>();
		myDetails.put("FirstName", "Sommanna");
		myDetails.put("SurName", "Sommanna");
		myDetails.put("Phone number", "(9304282873");
		myDetails.put("Password", "##90$$");
		myDetails.put("DOB", "20/4/1947");
		myDetails.put("Gender", "Male");
		
		System.out.println(myDetails);
		myDetails.replace("Gender", "Male", "Other");
		System.out.println(myDetails);

	}

}
