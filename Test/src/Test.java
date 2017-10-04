import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		
		
		int a;
		
		a =+ 1;
		a =+ 1;
		
		System.out.println(a);
		
		
		
//		Pattern p = Pattern.compile("\\d\\d\\d");
//	    Matcher m = p.matcher("a123b");
//	    System.out.println(m.find());
//	    System.out.println(m.matches());
	    
	    Pattern p = Pattern.compile("^[A-Z]");
	    Matcher m = p.matcher("A123b");

		System.out.println( 
				
				m.find()
//				Pattern.matches("^[A-Z]", "Aaaa")
//				Pattern.matches("aaa", "aaa")
				
				);
		
	
		
		System.out.println( 
				
				m.find()
//				Pattern.matches("^[A-Z]", "Aaaa")
//				Pattern.matches("aaa", "aaa")
				
				);
		
	
		
	}
}
