package ECommerce1.GoogleAuth;

import ECommerce1.entities.concretes.User;

public class GoogleAuthManager {

	
	public void logIn(User user) {
		
		System.out.print(user.getFirstName() + " is logged in with a Google account. ");
	}
	
}
