package listener_programs;

import java.awt.*;
import java.awt.event.*;


class Gender extends Frame implements ItemListener
{
	Checkbox c1,c2;
	CheckboxGroup cbg;
	Label l;
	Gender()
	{
		cbg=new CheckboxGroup();
		c1=new Checkbox("Male",true,cbg);
		c2=new Checkbox("Female",false,cbg);
		l=new Label("  Selection      ");
		add(c1);
		add(c2);
		add(l);
		c1.addItemListener(this);
		c2.addItemListener(this);
		setLayout(new FlowLayout());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String str=null;
		if(c1.getState())
		{
			str=c1.getLabel();
		}
		else if(c2.getState())
		{
			str=c2.getLabel();
		}
		l.setText(str);
	}
}

public class RadioButton {

	public static void main(String[] args) {
		Gender g=new Gender();
		g.setSize(500,400);
		g.setVisible(true);
	}
}
