package arrays;

public class TandC extends Exception
{
	int sid;
	TandC()
	{
		
	}
	public TandC(int sid)
	{
		this.sid = sid;
	}
	
	public String getMessage() {
		return "student with id "+sid+" Not found";
		}
	public String toString() {
		
		return "Student id not Found";
	}
		}
	
