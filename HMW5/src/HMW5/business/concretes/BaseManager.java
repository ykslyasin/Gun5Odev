package HMW5.business.concretes;

import java.util.Scanner;

import HMW5.business.abstracts.CheckService;
import HMW5.business.abstracts.EmailService;
import HMW5.business.abstracts.UserService;
import HMW5.core.abstracts.BaseService;
import HMW5.entities.concretes.User;

public class BaseManager implements BaseService{
	
	private EmailService emailService;
	private CheckService checkService;
	private UserService userService;
	
	public BaseManager(EmailService emailService , CheckService checkService , UserService userService) {
		this.emailService = emailService;
		this.checkService = checkService;
		this.userService = userService;
	}

	@Override
	public void signUp(User user) {
		if(checkService.validityCheck(user) == false) {
			System.out.println("Error : registration failed");
			return;
		}
		
		if(userService.getByEmail(user) == null) {
			System.out.println("Error : registration failed");
		}
		
		emailService.send(user.geteMail());
		System.out.println("Click on the links , 1(verify) or 2(cancel) ?");
		Scanner inp = new Scanner(System.in);
		int reply = inp.nextInt();
		if(reply == 2) {
			System.out.println("Warning : Your account is not verified");
			System.out.println("Error : registration failed");
			return;
		}
		if(reply == 1) {
			emailService.reply(user.geteMail());
			userService.signUp(user);
		}
	}

	@Override
	public void logIn(User user) {
		if(user.geteMail() == null || user.getPassword() == null) {
			System.out.println("Error : registration failed");
			return;
		}
		userService.logIn(user);
	}
	
}
