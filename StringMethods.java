public class StringMethods {
	public static void main(String[] args) {
		String s = "Computer Science Engineering Students";
		s = s.concat(" Delta ");
		System.out.println(s);
		
		String p = "CSE";
		System.out.println(p.length());
		System.out.println(p.charAt(0));
		System.out.println(p.charAt(1));
		
		
		String r = "CSE Delta";
		System.out.println(r.substring(1));
		
		String t = "Konaseema Andhra Pradesh";
		System.out.println(t.substring(1,14));
	}
}


