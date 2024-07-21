package listener_programs;

import java.awt.*;

class Ball extends Frame implements Runnable
{
	int x,y,tx,ty;
	Ball()
	{
		x=100;
		y=100;
		tx=3;
		ty=3;
		Thread t=new Thread(this);
		t.start();
	}
	public void paint(Graphics g)
	{
		g.fillOval(x,y,50,50);
		g.setColor(Color.GREEN);
	}
	@Override
	public void run() 
	{
		while(true)
		{
		 x+=tx;
		 y+=ty;
		 if(x<0||x>450)
			tx=tx*-1;
		 if(y<25||y>450)
			ty=ty*-1;
		 repaint();
		 try
		 {
			 Thread.sleep(5);
		 }
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
		}
	}
}
public class Animation 
{
	public static void main(String[] args) 
	{
		Ball v=new Ball();
		v.setVisible(true);
		v.setSize(500,500);
	}
}
