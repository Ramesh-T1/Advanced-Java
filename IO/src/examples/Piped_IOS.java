package examples;

import java.io.*;

class Producer extends Thread
{
	OutputStream po;
	Producer(OutputStream pos)
	{
	  po=pos;	
	}
	public void run()
	{
		int count=1;
		while(true)
		{
			try 
			{
				po.write(count);
				po.flush();
				System.out.println("Producer :"+count);
			    try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.flush();
				count++;
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Consumer extends Thread
{
	InputStream is;
	Consumer(InputStream pis)
	{
		is=pis;
	}
	public void run()
	{
		int x;
		while(true)
		{
		 try 
		 {
			x=is.read();
			System.out.println("Consumer :"+x);
			System.out.flush();
		 }
		 catch (IOException e) 
		 {
			e.printStackTrace();
		 }
		}
	}
}
public class Piped_IOS 
{
	public static void main(String[] args) throws IOException 
	{
		PipedOutputStream pos1=new PipedOutputStream();
		PipedInputStream pis1=new PipedInputStream();
		pis1.connect(pos1);
		Producer p=new Producer(pos1);
		Consumer c=new Consumer(pis1);
		p.start();
		c.start();
	}
}
