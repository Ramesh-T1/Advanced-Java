package listener_programs;

import java.awt.*;
import java.awt.event.*;

class TextDemo extends Frame
{
	TextField tf;
	Label l1,l2;
	TextDemo()
	{
		tf=new TextField(50);
		l1=new Label("Nothig Typed");
		l2=new Label("Pres Enter key to get text");
		add(tf);
		add(l1);
		add(l2);
		setLayout(new FlowLayout());
		Act a=new Act();
		tf.addTextListener(a);
		tf.addActionListener(a);
	}
	class Act implements ActionListener,TextListener
	{
		@Override
		public void textValueChanged(TextEvent e) {
			l1.setText(tf.getText());				
		}
		@Override
		public void actionPerformed(ActionEvent e) {
			l2.setText(tf.getText());				
		}			
	}
}
public class TextField_Example {

	public static void main(String[] args) {
		TextDemo td=new TextDemo();
		td.setSize(600,300);
		td.setVisible(true);
	}
}
