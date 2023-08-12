package StringPrograms;


public class RemoveSpecialChar {
	
	public static void main(String[] args) {
		
		String s="di@!&%nesh";
		
		System.out.println(s.replaceAll("[^a-zA-Z0-9]", ""));
	}

}
