package Collections_Practice;

import java.util.*;

public class ListEx1 {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<String>();
		List<Integer> l2=new LinkedList<Integer>();
		l1.add("Mathew");
		l1.add("Adam");
		l1.add("Rohit");
		l1.add("Virat");
		l1.add("Jadeja");
		l1.add("Shami");
		l2.add(1);
		l2.add(2);
		l2.add(3);
		l2.add(4);
		l2.add(5);
		l2.add(6);
		Iterator<String> it1=l1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		Iterator<Integer> it2=l2.iterator();
		while(it2.hasNext())
		{
			System.out.println(it2.next());
		}
	}
}
