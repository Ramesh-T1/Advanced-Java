package listener_programs;

import java.awt.*;
import java.awt.event.*;

class Box extends Frame
{
	Label l;
	Box()
	{
		l=new Label("Event");
		setLayout(new FlowLayout());
		add(l);
		Win_Listener wl=new Win_Listener();
		addWindowListener(wl);
	}
	class Win_Listener implements WindowListener
	{

		@Override
		public void windowOpened(java.awt.event.WindowEvent e) {
			l.setText("Window Opened");			
		}

		@Override
		public void windowClosing(java.awt.event.WindowEvent e) {
			l.setText("Window Closing");
			System.exit(0);
		}

		@Override
		public void windowClosed(java.awt.event.WindowEvent e) {
			l.setText("Window Closed");			
		}

		@Override
		public void windowIconified(java.awt.event.WindowEvent e) {
			l.setText("Window Iconified");				
		}

		@Override
		public void windowDeiconified(java.awt.event.WindowEvent e) {
			l.setText("Window DeIconified");		
		}

		@Override
		public void windowActivated(java.awt.event.WindowEvent e) {
			l.setText("Window Acivated");		
		}

		@Override
		public void windowDeactivated(java.awt.event.WindowEvent e) {
			l.setText("Window Deactivated");				
		}	
	}
}
public class WindowEvent {

	public static void main(String[] args) 
	{
		Box b=new Box();
		b.setVisible(true);
		b.setSize(500,500);
	}
}
