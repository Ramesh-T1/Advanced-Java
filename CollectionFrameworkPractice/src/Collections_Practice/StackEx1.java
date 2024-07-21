package Collections_Practice;

import java.util.*;

public class StackEx1 {

	public static void main(String[] args) {
		Stack<String> s=new Stack();
		s.add("Ram");
		s.add("Sam");
		s.add("Victor");
		s.add("Simon");
		System.out.println(s.search("Sam"));
		System.out.println(s.peek());
		System.out.println(s.pop());
		s.add("Mithilesh");
		for(String e:s)
		{
			System.out.println(e);
		}
		System.out.println(s.peek());
	}
}
