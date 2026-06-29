package collections_framework;

import java.util.Locale;
import java.util.ResourceBundle;


//by using this code we can get the message from different languages 
// so first create the file that include the message in that language
public class LocaleDemo {
	public static void main(String[] args) {
	
	ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.of("hi"));
	
	//to get the message from france replace the hi to fr so i can get the france output
	
	//ResourceBundle bundle = ResourceBundle.getBundle("msgs", Locale.FRANCE);
	
	//ResourceBundle bundle = ResourceBundle.getBundle("msgs");
	
	 System.out.println(bundle.getString("greeting"));
	 System.out.println(bundle.getString("message"));
	 

}
}
