
public class Vote {
	
	public void VoteAccess(int age) throws VoteDeniedException{
		if(age < 18) 
			throw new VoteDeniedException("Cannot perform Voting at " + age);
		
		System.out.println("You can't Vote");
	}
	
}