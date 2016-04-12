/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */

import java.io.Serializable;
import java.util.ArrayList;

public class TemperatureLog implements Serializable
{
   
	Integer temp;
	String place;
	ArrayList<Integer> templist;
	
	public TemperatureLog(Integer temp,String place)
	{
		this.temp=temp;
		this.place=place;
		this.templist=new ArrayList<Integer> ();
		templist.add(temp);
	}
	
	public Integer gettemp()
	{
		return this.temp;
		
	}
	public void settemp(Integer temp)
	{
		this.temp=temp;
		
	}
	
	public String getplace()
	{
		return this.place;
		
	}
	public void setplace(String place)
	{
		this.place=place;
	}
	public void setadd(Integer temp)
	{
		templist.add(temp);
		
	}
	public ArrayList<Integer> gettemplist()
	{
	   return this.templist;	
	}
	
	
}
