package WrapperExamples;

import java.util.*;

class DobWrapper
{
	double dn;

	public DobWrapper(double dn) 
	{
		this.dn = dn;
	}

	public double getDn() 
	{
		return dn;
	}

	public void setDn(double dn) 
	{
		this.dn = dn;
	}
}

public class Example1 {

	public static void main(String[] args) 
	{
		ArrayList<DobWrapper> a=new ArrayList<DobWrapper>();
		a.add(new DobWrapper(5.6));
		a.add(new DobWrapper(7.4d));
        for(int i=0;i<a.size();i++)
        {
        	System.out.println(a.get(i).getDn());
        }
	}

}
