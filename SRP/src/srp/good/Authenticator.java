package srp.good;

import srp.bad.User;

/**
 * User Authentication class
 */
public class Authenticator {
	public boolean checkAccess(User user) {
		return user != null
				&& (user.getUserType().equalsIgnoreCase("admin") 
						|| user.getUserType().equalsIgnoreCase("powerUser"));
	}
}
