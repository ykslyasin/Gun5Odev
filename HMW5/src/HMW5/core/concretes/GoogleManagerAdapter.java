package HMW5.core.concretes;

import HMW5.core.abstracts.BaseService;
import HMW5.entities.concretes.User;
import HMW5.google.GoogleManager;

public class GoogleManagerAdapter implements BaseService{
	
	GoogleManager googleManager = new GoogleManager();

	@Override
	public void signUp(User user) {
		if(user.geteMail() == null || user.getPassword() == null) {
			System.out.println("Warning : You have to enter an e-mail and password in fields !");
			System.out.println("Error : registration failed");
			return;
		}
		googleManager.signUp(user.geteMail());
	}

	@Override
	public void logIn(User user) {
		if (user.geteMail()==null || user.getPassword() == null) {
			System.out.println("Warning : You have to enter an e-mail and password in fields !");
			System.out.println("Error : Login failed");
			return;
		}
	}
	
}
