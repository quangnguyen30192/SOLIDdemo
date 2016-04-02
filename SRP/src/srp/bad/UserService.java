package srp.bad;

/**
 * This class is to provide all user's services and fulfill all requirements
 * about user
 */
public class UserService {
	
	/**
	 * Login function 
	 */
	public void login(User user) {
		if(checkAccess(user)) {
			// do Login
			viewInfo(user);
		}
	}
	
	/**
	 * Authentication function
	 */
	private boolean checkAccess(User user) {
		return user != null
				&& (user.getUserType().equalsIgnoreCase("admin") 
						|| user.getUserType().equalsIgnoreCase("powerUser"));
	}
	
	/**
	 * View user's information details 
	 */
	private void viewInfo(User user) {
		if(user == null) {
			throw new IllegalArgumentException("Invalid user accessed");
		}
		
		System.out.println("Name: " + user.getName());
		System.out.println("User Type: " + user.getUserType());
	}
}