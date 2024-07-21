package Collections_Practice;

import java.util.*;

public class LinkedListEx1 {

	public static void main(String[] args) {
		LinkedList<String> l=new LinkedList<String>();
		l.add("Kohli");
		l.add("Rohit");
		l.add("Martin");
		l.add("Convay");
		Iterator<String> it=l.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		l.remove(0);
		System.out.println("********");
		Iterator<String> it1=l.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
