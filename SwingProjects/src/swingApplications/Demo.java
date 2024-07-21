package swingApplications;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
	JLabel l;
	JButton b;
	int c=0;
	MyFrame()
	{
		super("Demo Example");
		l=new JLabel("Count :"+c);
		b=new JButton("Click");
		setLayout(new FlowLayout());
		add(l);
		add(b);
		b.addActionListener(this);//In Java Swing By default button will respond to spacebar
		getRootPane().setDefaultButton(b);//This will make button b to respond to ENTER button
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		++c;
		l.setText("Count :"+c);	
	}
}
public class Demo 
{
	public static void main(String[] args) 
	{
       MyFrame f=new MyFrame();
       f.setVisible(true);
       f.setSize(500,500);
       f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
