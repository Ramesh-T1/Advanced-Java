package net_prac;

import java.net.*;
import java.util.Arrays;

public class InetAddress_Ex1 
{
	public static void main(String[] args) throws Exception
	{
		try {
			InetAddress ia1=InetAddress.getByName("www.javatpoint.com");
			System.out.println("ia1="+ia1);
			InetAddress ia2[]=InetAddress.getAllByName("www.javatpoint.com");
			System.out.println("ia2="+ia2);
			System.out.println(ia1.getHostName());
			System.out.println(ia1.getHostAddress());
			System.out.println(Arrays.toString(ia1.getAddress()));
			System.out.println(ia1.getLocalHost());
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
