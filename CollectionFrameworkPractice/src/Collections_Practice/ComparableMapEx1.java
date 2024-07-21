package Collections_Practice;

import java.util.*;

class Code<Sec,Lec> implements Comparable<Code>
{
	private String s;
	private String l;
	
	public Code(String s, String l) 
	{
		this.s = s;
		this.l = l;
	}
	public String getS() 
	{
		return s;
	}
	public void setS(String s) 
	{
		this.s = s;
	}
	public String getL() 
	{
		return l;
	}
	public void setL(String l) 
	{
		this.l = l;
	}
	@Override
	public String toString() 
	{
		return "Code [s=" + s + ", l=" + l + "]";
	}
	@Override
	public int hashCode() 
	{
		return Objects.hash(l, s);
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Code other = (Code) obj;
		return Objects.equals(l, other.l) && Objects.equals(s, other.s);
	}
	@Override
	public int compareTo(Code o) 
	{
		String s1=s.concat(l);
		String s2=o.getS().concat(o.getL());
	    return (s1.compareTo(s2));
	}	
}
public class ComparableMapEx1 
{
	public static void main(String[] args)
	{	
		Map<Code,String> m=new TreeMap<Code,String>();
		m.put(new Code("S01","L01"),"Roketry");
		m.put(new Code("S01","L02"),"Medicine");
		m.put(new Code("S01","L04"),"Engineering");
		m.put(new Code("S01","L03"),"Cinema");
		m.put(new Code("S03","L05"),"Mission");
		m.put(new Code("S02","L01"),"Rugby");
		Iterator<Map.Entry<Code,String>> it=m.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<Code,String> temp=it.next();
			System.out.println("Key ="+temp.getKey()+" Value ="+temp.getValue());
		}
	}
}
