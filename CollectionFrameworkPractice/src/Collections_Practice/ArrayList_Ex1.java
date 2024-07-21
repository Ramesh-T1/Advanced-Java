package Collections_Practice;

import java.util.*;
public class ArrayList_Ex1 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ramesh");
		al.add("Bramti");
		al.add("Karnath");
		al.add("Babita");
		for(String x:al)
		{
			System.out.println(x);
		}
		al.removeLast();
		al.set(0,"Ramesh Bramti");
		for(String y:al)
		{
			System.out.println(y);
		}
	}
}
