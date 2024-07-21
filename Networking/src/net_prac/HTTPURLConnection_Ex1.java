package net_prac;

import java.io.*;
import java.net.*;

public class HTTPURLConnection_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		URL u=new URL("http://javatpoint.com");
		HttpURLConnection huc=(HttpURLConnection)u.openConnection();
		int i;
		for(i=1;i<=8;i++)
		{
			System.out.println(huc.getHeaderField(i));
		}
		huc.disconnect();
	}
}
