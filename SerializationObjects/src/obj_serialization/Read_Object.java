package obj_serialization;

import java.io.*;

public class Read_Object {

	public static void main(String[] args) throws Exception
	{
		FileInputStream fis=new FileInputStream("File_Project/Vehicle.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Serial_Object so1=(Serial_Object)ois.readObject();
		Serial_Object so2=(Serial_Object)ois.readObject();
		System.out.println("Object 1 :"+so1);
		System.out.println("Object 2 :"+so2);
	}
}
