package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Example2 extends Frame
{
	TextField tf1,tf2;
	Label l1,l2,l3,l4;
	Example2()
	{
		tf1=new TextField(50);
		tf2=new TextField(50);
		l1=new Label("Nothing yet typed in text box 1");
		l2=new Label("Press Enter key to get text 1");
		l3=new Label("Nothing yet typed in text box 2");
		l4=new Label("Press Enter key to get Text 2");
		add(tf1);
		add(tf2); 
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		setLayout(new FlowLayout());
		Fig f=new Fig();
		tf1.addTextListener(f);
		tf2.addTextListener(f);;
		tf1.addActionListener(f);
		tf2.addActionListener(f);	
	}
	class Fig implements ActionListener,TextListener
	{		
		@Override
		public void actionPerformed(ActionEvent e) {			
				l2.setText(tf1.getText());
				l4.setText(tf2.getText());					
		}
		@Override
		public void textValueChanged(TextEvent e) {
			l1.setText(tf1.getText());
			l3.setText(tf2.getText());		
		}			
	}
}
public class TextField_Ex2 {

	public static void main(String[] args) {
		Example2 e2=new Example2();
		e2.setSize(600,500);
		e2.setVisible(true);
	}
}
