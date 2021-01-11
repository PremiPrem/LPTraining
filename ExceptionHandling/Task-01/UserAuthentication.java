class User {
	public User(){		
	}
}

public class UserAuthentication {
	
	public User authenticate(String NId) throws UserNotFoundException{
		if(NId.equals("123456789v")) {
			return new User();
		} else {
			throw new UserNotFoundException("invalid NIC No " + NId);
		}
}
}