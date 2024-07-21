package listener_programs;

import java.awt.*;
import java.awt.event.*;
class ListFrame extends Frame
{
	List l;
	Choice c;
	TextArea ta;
	ListFrame()
	{
		l=new List(4,true);
		c=new Choice();
		ta=new TextArea(50,50);
		add(l);
		add(c);
		add(ta);
		c.add("--Select Team--");
		c.add("Arsenal");
		c.add("Brighton");
		c.add("Chelsea");
		setLayout(new FlowLayout());
		ExFrame ef=new ExFrame();
		c.addItemListener(ef);
		l.addItemListener(ef);
		l.addActionListener(ef);
	}
	class ExFrame implements ItemListener,ActionListener
	{
		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(e.getSource()==c)
			{
				if(c.getSelectedItem().equals("--Select Team--"))
				{
					l.removeAll();
					ta.setText(null);
				}
				else if(c.getSelectedItem().equals("Arsenal"))
				{
					l.removeAll();
					ta.setText(null);
					l.addItem("David Raya");
					l.addItem("Aron Ramsdale");
					l.addItem("Ben White");
					l.addItem("Gabriel");
					l.addItem("Rob Holding");
					l.addItem("Martin Odegaard");
					l.addItem("Declan Rice");
					l.addItem("Leandro Trossard");
				}
				else if (c.getSelectedItem().equals("Chelsea"))
				{
					l.removeAll();
					ta.setText(null);
					l.addItem("Mykhailo Petrovych Mudryk");
					l.addItem("Carney Chibwueze Chukwuemeka");
					l.addItem("Thiago Emiliano da Silva");	
				}
				else if (c.getSelectedItem().equals("Brighton"))
				{
					l.removeAll();
					ta.setText(null);
					l.addItem("Tariq Lamptey");
					l.addItem("Evan Ferguson");
					l.addItem("Mahmoud Dahoud");
					l.addItem("Facundo Buonanotte");
					l.addItem("João Pedro");
					l.addItem("Kaoru Mitoma");
				}
			}			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String[] a=l.getSelectedItems();
			String pn="";
			for(String x:a)
			{
				pn+=x+"\n";
			}
			ta.setText("Team:"+c.getSelectedItem()+"\n"+"Playername:"+pn);
		}		
	}
}
public class List_Choice_Ex {

	public static void main(String[] args) {
		ListFrame lf=new ListFrame();
		lf.setSize(600,600);
		lf.setVisible(true);
	}
}
