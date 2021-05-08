package ECommerce1.dataAccess.abtracts;

import java.util.List;

import ECommerce1.entities.concretes.User;

public interface UserDao {

	void add(User user);

	void update(User user);

	void delete(User user);

	User get(int id);

	User get(String eMail);

	List<User> getAll();

}
