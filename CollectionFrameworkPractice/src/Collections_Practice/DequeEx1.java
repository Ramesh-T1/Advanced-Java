package Collections_Practice;

import java.util.*;

public class DequeEx1 
{
	public static void main(String[] args) 
	{
		Deque<String> d=new ArrayDeque<String>(5);
		d.offerFirst("Smith");
		d.offer("Ricky Ponting");
		d.offer("Vikram Batra");
		d.offerLast("Virendar Sehwag");
		d.offerFirst("Suma");
		System.out.println("Deque");
		for(String s:d)
		{
			System.out.println(s);
		}
        d.remove();
        for(String s:d)
		{
			System.out.println(s);
		}
	}

}
