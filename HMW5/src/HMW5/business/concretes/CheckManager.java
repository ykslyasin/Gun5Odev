package HMW5.business.concretes;

import java.util.regex.Pattern;

import HMW5.business.abstracts.CheckService;
import HMW5.entities.concretes.User;

public class CheckManager implements CheckService{
	
	public static final Pattern isValidEmail_Pattern = 
			            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	@Override
	public boolean validityCheck(User user) {
		if(validEmail(user.geteMail()) && 
				validPassword(user.getPassword()) && 
				validName(user.getFirstName() , 
						  user.getLastName())) {
			
			return true;
			
		}
		return false;
	}
	
	public boolean validEmail(String eMail) {
		if(isValidEmail_Pattern.matcher(eMail).find() == false) {
			System.out.println("E-mail field is not in the desired format");
		}
		return true;
	}
	
	public boolean validPassword(String password) {
		if(password.length() >=6) return true;
		System.out.println("Password field is not in the desired format");
		return false;
	}
	
	public boolean validName(String firstName , String lastName) {
		if(firstName.length() >= 2 && lastName.length() >= 2) {
			return true;
		}
		System.out.println("You entered the wrong name and surname");
		return false;
	}
	
}
