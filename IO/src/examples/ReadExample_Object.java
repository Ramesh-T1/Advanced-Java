package examples;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ReadExample_Object 
{
	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("D:\\Ramesh\\Java Practice Area\\PrintStreamData.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		Student s1=new Student();
		s1.rollno=Integer.parseInt(br.readLine());
		s1.name=br.readLine();
		s1.dept=br.readLine();
		System.out.println(s1.rollno);
		System.out.println(s1.name);
		System.out.println(s1.dept);
	}
}
