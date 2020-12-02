package ejercicios;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String regexp = "[0-9]{8}[a-zA-Z]{1}";
		
		System.out.println(Pattern.matches(regexp, "01234567A"));
		System.out.println(Pattern.matches(regexp, "1/12/2014"));
		System.out.println(Pattern.matches(regexp, "11/2/2014"));
		System.out.println("---------------------------------------");		

		String cadena="01/01/2000";
		
		Pattern patron=Pattern.compile("\\d{2}\\/\\d{2}\\/(\\d{4})");
		Matcher matcher=patron.matcher(cadena);
		matcher.find();
		System.out.println(matcher.group(1));
	}

}
