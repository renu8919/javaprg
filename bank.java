class withdrawException extends Exception
{

	withdrawException(String msg)
	
	{
	
		super(msg);

	}
        
	 withdrawException(){}
}

class count 
{

	void withdraw(double amt, double bal) throws withdrawException
	{
		if(amt>bal)
		throw new withdrawException("Insufficient Balance");

		else 
		System.out.println("Amount = " +amt+"Balance =" +bal);
	}	





}
 class widrawException
{

	public static void main(String ...args)
	{
		count a = new count();
		try
		{
			a.withdraw(0.0,010);
	
		
		}

		catch(withdrawException e)
		{
		
			System.out.println(e);
		
		}
	
	}
}








