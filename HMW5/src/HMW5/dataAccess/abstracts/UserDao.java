package HMW5.dataAccess.abstracts;

import HMW5.entities.concretes.User;

public interface UserDao {
	
	void signUp(User user);
	
	void delete(User user);
	
	void logIn(User user);
	
	User getByEmail(String eMail);
}
