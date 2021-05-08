package ECommerce1;

import java.util.ArrayList;

import ECommerce1.GoogleAuth.GoogleAuthManager;
import ECommerce1.bussiness.abstracts.UserService;
import ECommerce1.bussiness.concretes.UserManager;
import ECommerce1.dataAccess.concretes.HibernateUserDao;
import ECommerce1.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 ArrayList<User> users = new ArrayList<>();
	

		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthManager());
		User user = new User(1, "Sema", "Mente", "Sema123", "sema@example.com", "12356");
        userService.register(user);
       
        userService.logIn(user);
        users.add(user);
       
		
		
	}

}
