package HMW5.dataAccess.concretes;

import HMW5.dataAccess.abstracts.UserDao;
import HMW5.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void delete(User user) {
		System.out.println("You registered to the system : " + user.geteMail());
	}

	@Override
	public void signUp(User user) {
		System.out.println("Deleted from the system : " + user.geteMail());
	}

	@Override
	public void logIn(User user) {
		System.out.println("You logged in to the system : " + user.geteMail());
	}

	@Override
	public User getByEmail(String eMail) {
		return null;
	}

}
