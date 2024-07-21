package obj_serialization;

import java.io.*;

public class Write_Object {

	public static void main(String[] args) 
	{
		try
		{
			 FileOutputStream fos=new FileOutputStream("File_Project\\Vehicle.dat");
			 ObjectOutputStream obs=new ObjectOutputStream(fos);
			 Serial_Object s1=new Serial_Object("Mercedes","Limousine",8080);
			 Serial_Object s2=new Serial_Object("Hyundai","Creta",7045);
			 obs.writeObject(s1);
			 obs.writeObject(s2);
			 System.out.println("Objects Written Sucessfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
