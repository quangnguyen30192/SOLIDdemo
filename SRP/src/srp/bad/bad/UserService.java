package srp.bad.bad;

import srp.bad.User;

/**
 * This class is to provide all user's services and fulfill all requirements
 * about user
 */
public class UserService {
	
	/**
	 * Login function 
	 */
	public void login(User user) {
		
		if(user == null) {
			throw new IllegalArgumentException("Invalid user accessed");
		}
		
		// Authentication
		if( user != null
				&& (user.getUserType().equalsIgnoreCase("admin") 
						|| user.getUserType().equalsIgnoreCase("powerUser"))) {
			// do Login

			//view user's information details 
			System.out.println("Name: " + user.getName());
			System.out.println("User Type: " + user.getUserType());
		}
	}
}