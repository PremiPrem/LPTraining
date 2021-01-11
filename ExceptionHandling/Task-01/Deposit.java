
public class Deposit {
	
	public void depositMoney(int amount) throws IllegalDepositException{
		if(amount <= 0) 
			throw new IllegalDepositException("Cannot perform deposit for " + amount);
		
		System.out.println("Your deposit is successful");
	}
	
}