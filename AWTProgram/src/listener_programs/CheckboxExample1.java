package listener_programs;

import java.awt.*;
import java.awt.event.*;

class MyComp extends Frame implements ItemListener {
	Label l;
	Checkbox c1, c2, c3, c4;

	MyComp() {
		super("Checkbox Demo");
		l = new Label("Nothing Selected                                                  ");
		c1 = new Checkbox("Java");
		c2 = new Checkbox("C#");
		c3 = new Checkbox("Python");
		c4 = new Checkbox("R programming");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		add(l);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		setLayout(new FlowLayout());
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
		
		l.setText(s);
	}
}

public class CheckboxExample1 {
	public static void main(String[] args) {
		MyComp m = new MyComp();
		m.setSize(800, 400);
		m.setVisible(true);

	}
}
