package utilities;

public class Singleton {
	
	
	private  static String str;
	
	
	public static String get() {
		if (str==null) {
		System.out.println("adding value");
		str="akjdilshd";
		}
		return str;
	}
	
	
}
