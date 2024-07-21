package Collections_Practice;

import java.io.ObjectInputStream.GetField;
import java.util.*;

public class MapIteration 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> m=new HashMap<Integer,String>();
		m.put(1,"Ramesh Doctor");
		m.put(2,"Ramesh Engineer");
		m.put(3,"Rohit");
		m.put(4,"Virat");
		m.put(5,"Ravindra Jadeja");
		System.out.println("Printitng m 1");
		for(Integer i:m.keySet())
		{
			System.out.println("Key ="+i+" Value ="+m.get(i));
		}
	    System.out.println("Printitng m 2");
		for(Map.Entry<Integer,String> y:m.entrySet())
		{
			System.out.println("Key ="+y.getKey()+" Value ="+y.getValue());
		}
		System.out.println("Printing m 3");
		Iterator<Map.Entry<Integer,String>> it=m.entrySet().iterator();
		while(it.hasNext())
		{
		 Map.Entry<Integer,String> temp=it.next();
		 System.out.println("Key ="+temp.getKey()+" Value ="+temp.getValue());
		}
		Map<String,String> n=new HashMap<String,String>();
		n.put("a1","Ramesh Doctor");
		n.put("a2","Ramesh Engineer");
		n.put("a3","Rohit");
		n.put("a4","Virat");
		n.put("a5","Ravindra Jadeja");
		System.out.println("Printing n 1");
        for(Map.Entry<String,String> x:n.entrySet())
        {
        	System.out.println("Key ="+x.getKey()+" Value ="+x.getValue());
        }
        System.out.println("Printing n 2");
        Iterator<Map.Entry<String,String>> it1=n.entrySet().iterator();
        while(it1.hasNext())
        {
        	Map.Entry<String,String> temp1=it1.next();
        	System.out.println("Key ="+temp1.getKey()+" Value ="+temp1.getValue());
        }
	}

}
