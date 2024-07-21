package Collections_Practice;

import java.util.*;

class Names implements Comparable<Names>
{
	private String n;

	public Names(String n)
	{
		this.n = n;
	}
	public String getN() 
	{
		return n;
	}
	public void setN(String n) 
	{
		this.n = n;
	}
	@Override
	public String toString() {
		return "Names [n=" + n + "]";
	}
	@Override
	public int compareTo(Names o) 
	{
		if(n.length()<o.n.length())
		{
			return-1;
		}
		else if(n.length()>o.n.length())
		{
			return 1;
		}
		else
		{
		  return 0;
		}
	}
}
public class ComparableInterface 
{
	public static void main(String[] args) 
	{
		ArrayList<Names> a=new ArrayList<Names>();
		a.add(new Names("Ramesh"));
		a.add(new Names("Suresh"));
		a.add(new Names("Priyanka"));
		a.add(new Names("BhanuPrakash"));
		a.add(new Names("Abu"));
		a.sort(null);
		Iterator it=a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
