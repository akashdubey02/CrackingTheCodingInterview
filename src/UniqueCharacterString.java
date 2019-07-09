
public class UniqueCharacterString {
	public String checkString(String s) {
		if(s.length() == 0) {
			return "Empty String";
		}
		for(int i=0; i< s.length(); i++) {
			for(int j= i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return "No";
				}
			}
		}		
		return "Yes";
	}
}
