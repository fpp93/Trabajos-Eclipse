import java.util.*;

class VaultDoor1 {
    public static void main(String args[]) {
        VaultDoor1 vaultDoor = new VaultDoor1();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter password: ");
	
    String userInput = scanner.next();
	String input = userInput.substring("PSP{".length(),userInput.length()-1);
	
	if (vaultDoor.checkPassword(input)) {
	    System.out.println("YES!!!!!!");
	} else {
	    System.out.println("NO!!!!!!");
	}
   }


    public boolean checkPassword(String password) {
        return password.length() == 32 &&
                password.charAt(0)  == '*' &&
                password.charAt(29) == 'a' &&
                password.charAt(4)  == '3' &&
                password.charAt(2)  == 's' &&
                password.charAt(23) == 'l' &&
                password.charAt(3)  == 't' &&
                password.charAt(17) == '0' &&
                password.charAt(1)  == '3' &&
                password.charAt(7)  == 'x' &&
                password.charAt(10) == '3' &&
                password.charAt(5)  == '_' &&
                password.charAt(9)  == 'm' &&
                password.charAt(11) == 'n' &&
                password.charAt(15) == '_' &&
                password.charAt(8)  == '4' &&
                password.charAt(12) == '_' &&
                password.charAt(20) == '4' &&
                password.charAt(14) == 's' &&
                password.charAt(6)  == '3' &&
                password.charAt(24) == '_' &&
                password.charAt(18) == '_' &&
                password.charAt(13) == '3' &&
                password.charAt(19) == 'f' &&
                password.charAt(21) == 'c' &&
                password.charAt(16) == 't' &&
                password.charAt(27) == 'g' &&
                password.charAt(30) == 'p' &&
                password.charAt(25) == 'y' &&
                password.charAt(22) == '1' &&
                password.charAt(28) == 'u' &&
                password.charAt(26) == '_' &&
                password.charAt(31) == '0';
    }
}
