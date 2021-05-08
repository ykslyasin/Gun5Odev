package HMW5.business.abstracts;

import HMW5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	
	void delete(User user);
	
	void logIn(User user);
	
	User getByEmail(User user);
}
