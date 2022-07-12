package MultiThreads;

public class Producer extends Thread
{
	InterThreadingCommunication obj;
	public Producer(InterThreadingCommunication obj) {
		this.obj = obj;
	}
	public void run() {
		int i=0;
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
			obj.set(i);
			i++;
		}
	}
	
}
