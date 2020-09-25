import java.util.Scanner;

public class EmailAddressJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sharks = new Scanner (System.in);
		System.out.println("What is your first name?");
		String firstName = Sharks.nextLine();
		System.out.println("Hello " + firstName + "! What is your last name? ");
		String lastName  = Sharks.nextLine();
		System.out.println("Hello " + firstName + " "+ lastName + "!" + " " + "What is your middle initial?");
		String midInitial = Sharks.nextLine();
		System.out.println("Your name is " + firstName + " " + midInitial +  " " + lastName );
		System.out.println("What day of the month were you born?");
		String birthDay = Sharks.nextLine();
		System.out.println("What month of the year were you born? (Number out of 12)");
		String birthMonth = Sharks.nextLine();
		System.out.println("What year were you born in?");
		String birthYear = Sharks.nextLine();
		System.out.println("So your name is " + firstName + " " + lastName + " " + "and you were born on " + birthMonth + "/" + birthDay  +  "/" + birthYear);
		//Email
		
		System.out.println("Your email will be : " + lastName.toLowerCase() + firstName.substring(0,1).toUpperCase()  + midInitial.toUpperCase() + "@sharkmail.com");
		System.out.println("Your temporary password will be : "  + birthMonth + birthDay + birthYear);
		System.out.println(" *** This temporary password is very insecure. Please change it immediately ***");
		System.out.println("What would you like your new password to be? Please make sure to add things like symbols, numbers, and case-sensitive words, so your account can be as protected as possible");
		String newPassword = Sharks.nextLine();
		System.out.println("Here are your new credentials");
		System.out.println("Email : " + lastName.toLowerCase() + firstName.substring(0,1).toUpperCase()  + midInitial.toUpperCase() + "@sharkmail.com");
		System.out.println("Password : " + newPassword);
		
	}

}
