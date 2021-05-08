package ECommerce1.core;

import ECommerce1.entities.concretes.User;

public interface AuthService {

	void register(User user);
	void logIn(User user);
	
}
