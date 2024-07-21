package listener_programs;

import java.awt.*;
import java.awt.event.*;

class LB_EX1 extends Frame
{
	List lb;
	Choice c;
	TextArea ta;
	LB_EX1()
	{
		lb=new List(6,true);
		c=new Choice();
		ta=new TextArea(80,80);
		setLayout(new FlowLayout());
		add(lb);
		add(c);
		add(ta);
		c.add("--Select Team--");
		c.add("Australia");
		c.add("India");
		c.add("South Africa");
		c.add("New Zeland");
		LB_EX1_Handler lbh1=new LB_EX1_Handler();
		lb.addItemListener(lbh1);
		c.addItemListener(lbh1);
		lb.addActionListener(lbh1);
	}
	class LB_EX1_Handler implements ItemListener,ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			String[] s=lb.getSelectedItems();
			String pn="";
			for(String x:s)
			{
				pn=pn+x+"\n";
			}
			ta.setText("Team Name :-"+c.getSelectedItem()+"\n"+"Players Selected :-"+pn+"\n");
		}
		@Override
		public void itemStateChanged(ItemEvent e) 
		{
		  if(e.getSource()==c)
		  {
			if(c.getSelectedItem().equals("--Select Team--"))
			{
				lb.removeAll();
				ta.setText(null);
			}
			else if(c.getSelectedItem().equals("Australia"))
			{
				lb.removeAll();
				ta.setText(null);
				lb.addItem("Davic Warner");
				lb.addItem("Mitchell Marsh");
				lb.addItem("Glenn Maxwell");
				lb.addItem("Steve Smith");
				lb.addItem("Mitchell Starc");
				lb.addItem("Marnus Labuschange");
				lb.addItem("Josh Hazelwood");
				lb.addItem("Pat Cummins");
			}
			else if(c.getSelectedItem().equals("India"))
			{
				lb.removeAll();
				ta.setText(null);
				lb.addItem("Ishan Kishan");
				lb.addItem("Virat Kohli");
				lb.addItem("Mohammad Shami");
				lb.addItem("Jasprit Bumrah");
				lb.addItem("Mohammad Siraj");
				lb.addItem("Shardul Thakur");
				lb.addItem("Kuldeep Yadav");
				lb.addItem("Ravindra Jadega");
			}
			else if(c.getSelectedItem().equals("South Africa"))
			{
				lb.removeAll();
				ta.setText(null);
				lb.addItem("Quinton De Cock");
				lb.addItem("Bavuma");
				lb.addItem("Van der Dessie");
				lb.addItem("Klassen");
				lb.addItem("Markram");
				lb.addItem("David Miller");
				lb.addItem("Jansen");
				lb.addItem("Kagiso Rabadda");
				lb.addItem("Coetzee");
			}
			else if(c.getSelectedItem().equals("New Zeland"))
			{
				lb.removeAll();
				ta.setText(null);
				lb.addItem("Latham");
				lb.addItem("Philips");
				lb.addItem("Kane Williamson");
				lb.addItem("Trent Boult");
				lb.addItem("Tim Southee");
			}	
		}
	   }
	}
}
public class LB_Choice 
{
	public static void main(String[] args) 
	{
		LB_EX1 le1=new LB_EX1();
		le1.setSize(800,800);
		le1.setVisible(true);
	}
}
