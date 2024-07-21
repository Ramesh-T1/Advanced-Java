package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Layer extends Frame
{
	TextArea ta;
	TextField tf1;
	Button b11;
	Layer()
	{
		ta=new TextArea(30,40);
		tf1=new TextField(100);
		b11=new Button("Reverse");
		add(ta);
		add(tf1);
		add(b11);
		setLayout(new FlowLayout());
		LayerSound l1=new LayerSound(); 
		b11.addActionListener(l1);		
	}
	class LayerSound implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) {
			String str=ta.getText();
			String[] str1=str.split(" ");
			String rev="";
			for(int i=0;i<str1.length;i++)
			{
		            rev = str1[i]+" "+rev;
		        
			}
			tf1.setText(rev);
		}	
	}
}
public class AWT_Example3 {

	public static void main(String[] args) {
		Layer w=new Layer();
		w.setSize(600,600);
		w.setVisible(true);
	}
}
