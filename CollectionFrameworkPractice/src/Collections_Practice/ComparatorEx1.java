package Collections_Practice;

import java.util.*;

class Data<k extends Integer,v extends String>
{
	private int k;
	private String v;
	public Data(int k, String v) 
	{
		this.k = k;
		this.v = v;
	}	
	public int getK() {
		return k;
	}
	public void setK(int k) {
		this.k = k;
	}
	public String getV() {
		return v;
	}
	public void setV(String v) {
		this.v = v;
	}
	@Override
	public String toString() 
	{
		return "Data [k=" + k + ", v=" + v + "]";
	}
}
public class ComparatorEx1 
{
	public static void main(String[] args) 
	{
		Comparator<Data<Integer,String>> cl=new Comparator<Data<Integer,String>>()
		{
			@Override
			public int compare(Data<Integer, String> o1, Data<Integer, String> o2) 
			{
				if(o1.getK()<o2.getK())
				{
					return -1;
				}
				else if(o1.getK()>o2.getK())
				{
					return 1;
				}
				else
				{
				    return 0;
				}
			}
		};
		Set<Data<Integer,String>> s=new TreeSet<Data<Integer,String>>(cl);
		s.add(new Data<>(11,"Ramesh Doctor"));
		s.add(new Data<>(2,"Ramesh Developer"));
		s.add(new Data<>(33,"Ramesh Engineer"));
		s.add(new Data<>(3,"Ramesh Cricketer"));
		s.add(new Data<>(440,"Ramesh Scientist"));
		s.add(new Data<>(5,"Ramesh Space Scientist"));
        Iterator it1=s.iterator();
        while(it1.hasNext())
        {
        	System.out.println(it1.next());
        }
	}
}
