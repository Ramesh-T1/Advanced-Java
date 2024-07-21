package net_prac;

import java.io.*;
import java.net.*;

public class URLConnection_EX1 {

	public static void main(String[] args) throws Exception
	{
		URL u=new URL("http://www.javatpoint.com//java-tutorial");
		URLConnection uc=u.openConnection();
		InputStream is=uc.getInputStream();
		int x;
		while((x=is.read())!=-1)
		{
			System.out.print((char)x);
		}
	}
}
