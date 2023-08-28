//Reverse a string using recuresion

class Recursive_string{
	public static void main (String[] args) {
	String str ="Bindhu Muniraja";
	System.out.println(recurString (str));
	}
	public static String recurString(String str){
		if (str == null || str.length()<=1){
			return str;
		}
		return recurString(str.substring(1)) + str.charAt(0);
		
	}	
}




