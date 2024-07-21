package net_prac;

import java.io.*;
import java.net.*;

public class InetAddress_Ex2 {

	public static void main(String[] args) throws Exception 
	{ 
	  InetAddress ip=InetAddress.getByName("www.javatpoint.com");
	  System.out.println("Host Address :"+ip.getHostAddress());
	  System.out.println("Address :"+ip.getAddress());
	  System.out.println("Canonical HostName :"+ip.getCanonicalHostName());
	  System.out.println("Loopback Address :"+ip.getLoopbackAddress());
	}
}
