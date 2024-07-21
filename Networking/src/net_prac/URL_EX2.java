package net_prac;

import java.io.*;
import java.net.*;

public class URL_EX2 
{
	public static void main(String[] args) throws Exception
	{
		URL u=new URL("http://www.javatpoint.com");
		System.out.println("Protocol:"+u.getProtocol());
		System.out.println("Authority:"+u.getAuthority());
		System.out.println("File:"+u.getFile());
		System.out.println("Reference:"+u.getRef());
		System.out.println("UserInfo:"+u.getUserInfo());
		System.out.println("Path:"+u.getPath());
		System.out.println("Host:"+u.getHost());
		System.out.println("Port:"+u.getPort());
	}

}
