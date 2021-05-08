package ECommerce1.bussiness.concretes;

import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import ECommerce1.GoogleAuth.GoogleAuthManager;
import ECommerce1.bussiness.abstracts.UserService;
import ECommerce1.core.AuthService;
import ECommerce1.dataAccess.abtracts.UserDao;
import ECommerce1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	public UserManager(UserDao userDao, GoogleAuthManager googleAuthManager) {
		super();
		this.userDao = userDao;

	}

	@Override
	public void register(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("Your password character must at least 6 charackter long.");
		
			
         return;
		}

		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(user.geteMail());

		if (!matcher.matches()) {
			System.out.print("E mail address must be this format : example@example.com");
			return;

		}
		if (userDao.get(user.geteMail()) != null) {
			System.out.print("This mail address has already taken. ");
			return;

		}

		if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Your name and surname must longer 2 character.");
			return;
		}

	}

	@Override
	public void logIn(User user) {

		if (user.geteMail() == null || user.getPassword() == null) {
			System.out.print("You must enter your password and e-mail address.");
			return;

		}

	}

	@Override
	public List<User> getAll() {

		return null;
	}

	@Override
	public User get(String eMail) {

		return null;
	}

}
