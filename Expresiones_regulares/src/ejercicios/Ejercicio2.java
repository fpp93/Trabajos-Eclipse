package ejercicios;

import java.util.regex.Pattern;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
String regexp = "[A-Za-z-0-9]+@[A-Za-z]+\\.[A-Za-z]{2,4}";
		
		System.out.println(Pattern.matches(regexp, "franparra2@gmail.com"));
		System.out.println(Pattern.matches(regexp, "jesusvalido@hola.com"));
		System.out.println(Pattern.matches(regexp, "odksos@com"));
		System.out.println("---------------------------------------");

	}

}
