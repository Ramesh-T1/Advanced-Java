package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Mouse extends Frame
{
	Label l,l1;
	Mouse()
	{
		l=new Label("Mouse Event");
		l1=new Label("Mouse Co-Ordinates");
		add(l);
		add(l1);
		setLayout(null);
		l.setBounds(10,10,200,100);
		l1.setBounds(10,120,200,100);
		Event ev=new Event();
		l.addMouseListener(ev);
		l1.addMouseListener(ev);
		l.addMouseMotionListener(ev);
		l1.addMouseMotionListener(ev);
	}
	class Event implements MouseListener,MouseMotionListener
	{

		@Override
		public void mouseDragged(MouseEvent e) {
			l.setText("Mouse Dragged");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			l.setText("Mouse Moved");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}
		@Override
		public void mouseClicked(MouseEvent e) {
			l.setText("Mouse Clicked");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}
		@Override
		public void mousePressed(MouseEvent e) {
			l.setText("Mouse Pressed");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}
		@Override
		public void mouseReleased(MouseEvent e) {
			l.setText("Mouse Released");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			l.setText("Mouse Entered");
			l1.setText("X="+e.getX()+",Y="+e.getY());	
		}
		@Override
		public void mouseExited(MouseEvent e) {
			l.setText("Mouse Exited");
			l1.setText("X="+e.getX()+",Y="+e.getY());			
		}		
	}
}
public class MouseEvent_EX 
{
	public static void main(String[] args)
	{
		Mouse m=new Mouse();
		m.setVisible(true);
		m.setSize(200,220);
	}
}
