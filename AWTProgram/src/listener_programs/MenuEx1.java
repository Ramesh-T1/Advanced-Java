package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Operations extends Frame
{
	 Menu Logic,Arithmetic,Operations;
	 MenuItem Add,Subtract,Multiply,Divide,OR,AND;
	 MenuBar mb;
	 Operations()
	 {
		 Operations=new Menu("Operations");
		 Logic=new Menu("Logic");
		 Arithmetic=new Menu("Arithmetic");
		 Add=new MenuItem("Add");
		 Subtract=new MenuItem("Subtract");
		 Multiply=new MenuItem("Multiply");
		 Divide=new MenuItem("Divide");
		 AND=new MenuItem("AND");
		 OR=new MenuItem("OR");
		 Arithmetic.add(Add);
		 Arithmetic.add(Subtract);
		 Arithmetic.add(Multiply);
		 Arithmetic.add(Divide);
		 Logic.add(OR);
		 Logic.add(AND);
		 Operations.add(Arithmetic);
		 Operations.add(Logic);
		 mb=new MenuBar();
		 mb.add(Operations);
		 setMenuBar(mb);
		 setLayout(null);
		 Act a=new Act();
		 Add.addActionListener(a);
	 }
	 class Act extends Frame implements ActionListener
	 {
		 Frame f1=new Frame("Add");
		 TextField tf1,tf2,tf3;
		 Label l1,l2,l3;
		 Button b;
		@Override
		public void actionPerformed(ActionEvent e)
		{
			setLayout(new BorderLayout());
			tf1=new TextField();
			tf1.setBounds(10,50,50,30);
			tf2=new TextField(20);
			tf2.setBounds(10,90,50,30);
			tf3=new TextField(20);
			tf3.setBounds(10,130,50,30);
			l1=new Label("Number1");
			l1.setBounds(80,50,50,30);
			l2=new Label("Number2");
			l2.setBounds(80,90,50,30);
			l3=new Label("Result");
			l3.setBounds(80,130,50,30);
			b=new Button("+ (ADD)");
			b.setBounds(150,90,50,30);
			f1.add(tf1);
			f1.add(tf2);
		    f1.add(tf3);
			f1.add(l1);
			f1.add(l2);
			f1.add(l3);	
			f1.add(b);
			Result r=new Result();
			b.addActionListener(r);
			f1.setVisible(true);
			f1.setSize(500,500);
		}	
		class Result implements ActionListener
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				int x,y,z;
				String s=tf1.getText();
				String s1=tf2.getText();
				x=Integer.parseInt(s);
				y=Integer.parseInt(s1);
				z=x+y;
				String s2=Integer.toString(z);
				//tf3.setText(""+z);	
				tf3.setText(s2);
			}	
		}
	 } 
}
public class MenuEx1 
{
	public static void main(String[] args) 
	{     
       Operations o=new Operations();
       o.setVisible(true);
       o.setSize(600,600);
	}
}
