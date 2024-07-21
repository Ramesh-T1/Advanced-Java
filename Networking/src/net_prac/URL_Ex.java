package net_prac;

import java.io.*;
import java.net.*;

public class URL_Ex 
{
	public static void main(String[] args) throws Exception 
	{
		URL u=new URL("http://www.javatpoint.com//java-tutorial");
        System.out.println("Host name :"+u.getHost());
        System.out.println("Port :"+u.getPort());
        System.out.println("Query :"+u.getQuery());
        System.out.println("Default Port :"+u.getDefaultPort());
	}
}
