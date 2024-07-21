package examples;

import java.io.*;

public class RandomAccessExample 
{
	public static void main(String[] args) throws IOException 
	{
	   RandomAccessFile rf=new RandomAccessFile("D:\\Ramesh\\Java Practice Area\\Practice1.txt","rw");
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   rf.skipBytes(2);
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   rf.seek(28);
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   rf.seek(0);
	   System.out.println((char)rf.read());
	   rf.seek(11);
	   System.out.println((char)rf.read());
	   rf.seek(30);
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	   System.out.println((char)rf.read());
	}
}
