/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeTemperature extends Observer
{

	public SerializeTemperature(TemperatureSensor subject)
	{
	      this.tempsensor_subject = subject;
	      this.tempsensor_subject.attach(this);
	}
	@Override
	public void update() throws IOException 
	{
	      System.out.println( "Serialise updated in  "+this.tempsensor_subject.getState().getplace());
	      
	      try
	      {
	         FileOutputStream fout = new FileOutputStream(this.tempsensor_subject.getState().getplace()+".dat");
	         ObjectOutputStream oos = new ObjectOutputStream(fout);
	         oos.writeObject(this.tempsensor_subject.getState());
	         oos.close();
	         //System.out.println("object written on the file");
	      }
	      catch(IOException e)
	      {
	    	  
	      }
	      
	      
	}
	
	
}
   