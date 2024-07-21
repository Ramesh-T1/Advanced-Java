package practice_awt;

import java.awt.*;
import java.awt.event.*;

class ObjectFrame extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4;
	//Label l1;
	TextField l1;
	ObjectFrame()
	{
		c1=new Checkbox("Australia");
		c2=new Checkbox("India");
		c3=new Checkbox("New Zeland");
		c4=new Checkbox("Pakistan");
		//l1 = new Label("Nothing Selected                                                  ");
		l1 = new TextField("Nothing Selected                                                  ");
		setLayout(new FlowLayout());
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(l1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		setLayout(new FlowLayout());
		System.out.println(c1.getLabel());
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		String s ="";
		if (c1.getState())
		{
			s = s + " " + c1.getLabel();
		}
		if (c2.getState()) 
		{
			s = s + " " + c2.getLabel();
		}
		 if (c3.getState()) 
		 {
			s = s + " " + c3.getLabel();
		 }
		 if (c4.getState()) 
		 {
			s = s + " " + c4.getLabel();
		 }
		if(s.isEmpty()) 
		{
			s = "Nothing";
		}	
		l1.setText(s);	
	}
}
public class Checkbox_EXA1 {

	public static void main(String[] args) {
		ObjectFrame of=new ObjectFrame();
		of.setSize(500,500);
		of.setVisible(true);
	}
}
