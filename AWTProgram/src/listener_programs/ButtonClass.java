package listener_programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyObject extends Frame implements ActionListener
{
	Label l;
	Button b;
	int count=0;
	MyObject()
	{
		super("Button Example");
		l=new Label(" "+count);
		b=new Button("Click");
		b.addActionListener(this);
		add(l);
		add(b);
		setLayout(new FlowLayout());
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		count++;
		l.setText(" "+count);		
	}
}

public class ButtonClass {

	public static void main(String[] args) {
		MyObject o=new MyObject();
		o.setSize(400,400);
		o.setVisible(true);
	}
}
