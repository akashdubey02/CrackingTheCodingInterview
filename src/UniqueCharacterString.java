
public class UniqueCharacterString {
	public boolean checkString(String s) {
		for(int i=0; i< s.length(); i++) {
			for(int j= i+1; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					return false;
				}
			}
		}		
		return true;
	}
}
