package listener_programs;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyFrame extends Frame implements ActionListener
{
	Label l;
	Button b;
	int count;
	MyFrame()
	{
		super("Button Example2");
		l=new Label(" "+count);
		b=new Button("Click");
		add(l);
		add(b);
		setLayout(new FlowLayout());
		b.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		count++;
		l.setText(" "+count);		
	}
	
}
public class ButtonExample2
{
	public static void main(String[] args)
	{
		MyFrame f=new MyFrame();
		f.setSize(400,400);
		f.setVisible(true);
	}
}
