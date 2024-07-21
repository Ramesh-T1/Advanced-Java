package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Figure extends Frame
{
	Scrollbar red,blue,green;
	TextField tf;
	Figure()
	{
		red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
		tf=new TextField();
		setLayout(null);
		tf.setBounds(50,50,300,50);
		red.setBounds(50,150,300,50);
		blue.setBounds(50,250,300,50);
		green.setBounds(50,350,300,50);
		add(tf);
		add(red);
		add(blue);
		add(green);
		EX e1=new EX();
	    red.addAdjustmentListener(e1);
	    blue.addAdjustmentListener(e1);
	    green.addAdjustmentListener(e1);
	}
	class EX implements AdjustmentListener
	{
		public void adjustmentValueChanged(AdjustmentEvent e) 
		{
			tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue()));
		}		
	}	
}
public class ScrollbarExample 
{
	public static void main(String[] args) 
	{
		Figure f=new Figure();
		f.setVisible(true);
		f.setSize(800,500);
	}
}
