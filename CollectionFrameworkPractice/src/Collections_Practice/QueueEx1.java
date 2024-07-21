package Collections_Practice;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueEx1
{
	public static void main(String[] args) 
	{
		Queue<String> q=new ArrayBlockingQueue<String>(5);
		q.offer("Animesh");
		q.offer("Gandhi");
		q.offer("Finn");
		q.offer("Steve");
		q.offer("Martin");
		q.offer("Niraj");//Since size of queue is 5 6th entry is not accepted and offer method does not throws error
		for(String s:q)
		{
			System.out.println(s);
		}
		q.poll();
		q.offer("Niraj");//As first element is removed we can add one more element as size of queue is 5 and we have only 4 elements
		System.out.println("Queue after poll method and offer method performed");
		for(String r:q)
		{
			System.out.println(r);
		}
	}

}
