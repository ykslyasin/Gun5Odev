package HMW5.core.abstracts;

import HMW5.entities.concretes.User;

public interface BaseService {
	void signUp(User user);
	
	void logIn(User user);
}
