package MultiThreads;

public class Consumer  extends Thread{
	InterThreadingCommunication obj;
	public Consumer(InterThreadingCommunication obj) {
		this.obj =obj;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				Thread.sleep(4000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			obj.get();
			
			}
		}
	}
