package MultiThreading;

public class withDrawThread {
	AClass obj;
	int amt;
	//String msg;
	public withDrawThread(AClass obj,int amt,String msg)

	{
		this.obj = obj;
		this.amt = amt;
		//this.msg=msg;
	}
	public void run() {
		try
		{
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println("First");
		obj.withdraw(amt);
	}
}
					