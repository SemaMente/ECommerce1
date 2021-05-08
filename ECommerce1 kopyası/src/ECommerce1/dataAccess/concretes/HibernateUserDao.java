package ECommerce1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import ECommerce1.dataAccess.abtracts.UserDao;
import ECommerce1.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.print(user.getFirstName() + " has been added.");

	}

	@Override
	public void update(User user) {
		System.out.print(user.getFirstName() + "has been updated.");

	}

	@Override
	public void delete(User user) {
users.remove(user);
System.out.println(user.getFirstName() + " has been deleted.");
	}

	@Override
	public User get(int id) {
	
		return null;
	}

	@Override
	public User get(String eMail) {
	for (User user: users) {
		if(user.geteMail().equals(eMail)) {
			return user;
		}
	}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}

}
