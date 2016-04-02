package srp.good;

import srp.bad.User;

/**
 * User information provider class
 */
public class UserInformationProvider {
	public void viewInfo(User user) {
		if(user == null) {
			throw new IllegalArgumentException("Invalid user accessed");
		}
		
		System.out.println("Name: " + user.getName());
		System.out.println("User Type: " + user.getUserType());
	}
}
