package srp.good;

import srp.bad.User;

/**
 * This class is to provide all user's services and fulfill all requirements
 * about user
 */
public class UserService {
	
	private Authenticator authenticator;
	private UserInformationProvider infoProvider;
	
	public UserService() {
		authenticator = new Authenticator();
	}
	
	public void login(User user) {
		if(authenticator.checkAccess(user)) {
			// do Login
			infoProvider = new UserInformationProvider();
			infoProvider.viewInfo(user);
		}
	}
}
