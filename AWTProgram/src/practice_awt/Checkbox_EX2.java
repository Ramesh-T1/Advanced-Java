package practice_awt;

import java.awt.*;
import java.awt.event.*;

class MyComponent extends Frame
{
	Checkbox c1,c2,c3,c4;
	//Label tf1;
	TextField tf1;
	MyComponent()
	{
		c1=new Checkbox("Red");
		c2=new Checkbox("Blue");
		c3=new Checkbox("Green");
		c4=new Checkbox("Yellow");
		tf1=new TextField("Colour Selected");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(tf1);
		setLayout(new FlowLayout());
		ComponentListener cl=new ComponentListener();
		c1.addItemListener(cl);
		c2.addItemListener(cl);
		c3.addItemListener(cl);
		c4.addItemListener(cl);
	}
	class ComponentListener implements ItemListener
	{
		String st="";
		@Override
		public void itemStateChanged(ItemEvent e)
		{	
			if(c1.getState())
			{
				st=st+" "+c1.getLabel();
			}
			if(c2.getState())
			{
				st=st+" "+c2.getLabel();
			}
			if(c3.getState())
			{
				st=st+" "+c3.getLabel();
			}
			if (c4.getState())
			{
				st=st+" "+c4.getLabel();
			}
			tf1.setText(st);
		}		
	}
}
public class Checkbox_EX2 
{
	public static void main(String[] args) 
	{
		MyComponent ce=new MyComponent();
		ce.setVisible(true);
		ce.setSize(500,500);
	}
}
