
public class Election {
	public static void main(String args[]) {
		
		UserAuthentication user = new UserAuthentication();
		try{
			user.authenticate("123456789v");			
			
		} catch(UserNotFoundException e) {
			System.err.println(e);
		}
		
		Vote v = new Vote();
		try{
			v.voteAccess(0);
			
		} catch(IllegalVotingException e) {
			System.err.println(e);
		}
	}
	
}



