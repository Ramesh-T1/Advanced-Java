package examples;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student
{
	int rollno;
	String name,dept;
}

public class PrintStreamExample {

	public static void main(String[] args) throws Exception 
	{
		File f=new File("D:\\Ramesh\\Java Practice Area\\PrintStreamData.txt");
		f.createNewFile();
		FileOutputStream fos=new FileOutputStream(f);
		PrintStream ps=new PrintStream(fos);
		Student s=new Student();
		s.rollno=14;
		s.name="Ramesh";
		s.dept="Engg";
		ps.println(s.rollno);
		ps.println(s.name);
		ps.println(s.dept);
	}
}
