package HMW5.business.abstracts;

import HMW5.entities.concretes.User;

public interface CheckService {
	boolean validityCheck(User user);
}
