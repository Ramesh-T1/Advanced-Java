package obj_serialization;

import java.io.Serializable;

public class Serial_Object implements Serializable
{
	private static final long serialVersionUID = -8591532171893666777L;
	private String vname;
	private String type;
	private int num;
	public Serial_Object(String vname, String type, int num) 
	{
		this.vname = vname;
		this.type = type;
		this.num = num;
	}
	@Override
	public String toString() {
		return "Serial_Object [vname=" + vname + ", type=" + type + ", num=" + num + "]";
	}
}
