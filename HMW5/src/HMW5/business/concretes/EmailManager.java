package HMW5.business.concretes;

import HMW5.business.abstracts.EmailService;

public class EmailManager implements EmailService{

	@Override
	public void send(String message) {
		System.out.println("verification email : " + message);
		
	}

	@Override
	public void reply(String message) {
		System.out.println("Your account has been verified : " + message);
		
	}

}
