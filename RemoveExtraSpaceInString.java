public class RemoveExtraSpaceInString {

	public static void main(String[] args) {
		String s1 = "Java is   an   Object   Oriented     Programming    language";  
//	System.out.println(s1.replaceAll("\\s+"," ").trim());
		String res = "";
		
		for(int i=0; i<s1.length()-1; i++) {
			char c = s1.charAt(i);
			if(c!=' ') {
				res+=c;
			}
			else if(s1.charAt(i+1) != ' ') {
				res+=" ";
			}
			
		}
		System.out.print(res);
	}	
}
