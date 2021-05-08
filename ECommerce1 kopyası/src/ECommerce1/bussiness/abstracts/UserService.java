package ECommerce1.bussiness.abstracts;

import java.util.List;

import ECommerce1.entities.concretes.User;

public interface UserService {

	void register(User user);

	void logIn(User user);

	List<User> getAll();

	User get(String eMail);
}
