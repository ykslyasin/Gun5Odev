package HMW5;

import HMW5.business.concretes.BaseManager;
import HMW5.business.concretes.CheckManager;
import HMW5.business.concretes.EmailManager;
import HMW5.business.concretes.UserManager;
import HMW5.core.abstracts.BaseService;
import HMW5.core.concretes.GoogleManagerAdapter;
import HMW5.dataAccess.concretes.HibernateUserDao;
import HMW5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1 , "Yasin" , "Yüksel" , "yksl.yasin@yahoo.com" , "123321");
		
		User user2 = new User(2 , "Burak" , "Þahin" , "shn.brk@yahoo.com" , "123456");
		
		User user3 = new User(3 , "Engin" , "Demirog" , "dmrg.engn@yahoo.com" , "123654");
		
		User user4 = new User();
		user4.setId(4);
		user4.setFirstName("Yasin");
		user4.setLastName("Yüksel");
		user4.seteMail("yasinyksl@hotmail.com");
		user4.setPassword("3113");
		
		User user5 = new User(5 , "Yasin" , "Yüksel" , "yksl.yasin@yahoo.com" , "123987");
		
		BaseService service1 = new BaseManager(new EmailManager() , 
				                               new CheckManager() , 
				                               new UserManager(new HibernateUserDao()));
		
		service1.signUp(user1);
		service1.logIn(user1);
		
		System.out.println("----------");
		service1.signUp(user2);
		
		System.out.println("----------");
		service1.signUp(user3);
		
		System.out.println("----------");
		BaseService service2 = new GoogleManagerAdapter();
		service2.logIn(user4);
		
		System.out.println("----------");
		service2.logIn(user5);
	}

}
