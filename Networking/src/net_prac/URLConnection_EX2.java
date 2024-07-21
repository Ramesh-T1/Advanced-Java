package net_prac;

import java.io.*;
import java.net.*;

public class URLConnection_EX2 
{
	public static void main(String[] args) throws Exception
	{
		URL u=new URL("http://www.javatpoint.com");
		URLConnection ucon=u.openConnection();
		InputStream is=ucon.getInputStream();
		int x;
		while((x=is.read())!=-1)
		{
			System.out.println((char)x);
		}
	}
}
