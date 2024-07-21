package save;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;

class MyFrame extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2;
	Button b;
	MyFrame()
	{
		l1=new Label("Userid");
		l2=new Label("Password");
		l3=new Label("Tasks");
		b=new Button("Save to File");
		t1=new TextField();
		t2=new TextField();
		l1.setBounds(15,45,100,40);
		l2.setBounds(15,95,100,40);
		t1.setBounds(120,45,200,25);
		t2.setBounds(120,95,200,25);
		b.setBounds(25,150,150,35);
		l3.setBounds(25,220,300,40);
		add(l1);
		add(l2);
		add(b);
		add(t1);
		add(t2);
		add(l3);
		setLayout(new BorderLayout());
		b.addActionListener(this);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String s1,s2;
		boolean flag = false;
		s1=t1.getText();
		s2=t2.getText();
		try 
		{
			FileWriter fw=new FileWriter("D:\\Ramesh\\Java Practice Area\\AWT_Saved Files.txt");
			fw.write(s1);
			fw.write(s2);
			fw.flush();
			fw.close();
			flag=true;
		} 
		catch (IOException e1)
		{
			e1.printStackTrace();
		}
		if(flag==true)
		{
			l3.setText("User credential copied to file sucessfully");
		}
		t1.setText("");
		t2.setText("");
	}
}

public class UserCredentials {

	public static void main(String[] args) 
	{
		MyFrame mf=new MyFrame();
		mf.setVisible(true);
		mf.setSize(600,600);
	}
}
