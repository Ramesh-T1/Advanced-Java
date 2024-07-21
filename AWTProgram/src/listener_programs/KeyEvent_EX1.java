package listener_programs;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class KeyExercise extends Frame implements KeyListener
{
	Label l1,l2,l3,l4;
	KeyExercise()
	{
		super("Key Event");
		l1=new Label("");
		l2=new Label("");
		l3=new Label("");
		l4=new Label("");
		setLayout(null);
		l1.setBounds(10,10,200,80);
		l2.setBounds(10,100,200,80);
		l3.setBounds(10,190,200,80);
		l4.setBounds(10,280,200,80);
		add(l1);
		add(l2);
		add(l3);
		add(l4);
	/*	ListenerEx le=new ListenerEx();
		l1.addKeyListener(le);
		l2.addKeyListener(le);
		l3.addKeyListener(le);
		l4.addKeyListener(le); */
		addKeyListener(this);
	}
		@Override
		public void keyTyped(KeyEvent e) 
		{
			l1.setText("Key Typed :"+e.getKeyChar());
			l3.setText("");		
		}
		@Override
		public void keyPressed(KeyEvent e) 
		{
		  l2.setText("Key Pressed :"+e.getKeyChar()); 
		  l4.setText(""+e.getWhen());
		  //l1.setText("");
		  l3.setText("");		
		}
		@Override
		public void keyReleased(KeyEvent e) 
		{
			l3.setText("Key Released :"+e.getKeyChar());
			l1.setText("");
			l2.setText("");	
			l4.setText("");			
		}		
}
/*	class ListenerEx implements KeyListener
	{
		@Override
		public void keyTyped(KeyEvent e) 
		{
			l1.setText("Key Type"+e.getKeyChar());
			l4.setText(e.getWhen()+"");
			l3.setText("");		
		}
		@Override
		public void keyPressed(KeyEvent e) 
		{
		  l2.setText("Key Pressed"+e.getKeyChar());
		  l4.setText(e.getWhen()+"");
		  //l1.setText("");
		  l3.setText("");		
		}
		@Override
		public void keyReleased(KeyEvent e) 
		{
			l3.setText("Key Released"+e.getKeyChar());
			l1.setText("");
			l2.setText("");	
			l4.setText("");			
		}		
	}
}*/

public class KeyEvent_EX1 extends Frame
{
	public static void main(String[] args) 
	{
		KeyExercise k=new KeyExercise();
		k.setSize(900,600);
		k.setVisible(true);
	}

}
