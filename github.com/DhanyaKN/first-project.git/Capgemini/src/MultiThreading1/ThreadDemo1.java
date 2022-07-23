package MultiThreading1;

import palindrome.A;

public class ThreadDemo1 {

	public static void main(String[] args) {
		A oa1=new A();
        A oa2=new A();
        B ob=new B("GAYATRI");
       
        Thread t1=new Thread();
        Thread t2=new Thread();
        Thread t3=new Thread(ob);
       
        t1.start();
        t2.start();
        t3.start();
        
        try
        {
        t1.join();
        t2.join();
        t3.join();
        }
        catch(Exception e)
        {
        }
        System.out.println("HAVE  A NICE DAY");   
	}
}

