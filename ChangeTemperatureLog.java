/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */
import java.io.IOException;
import java.util.TimerTask;
import java.util.concurrent.ThreadLocalRandom;

public class ChangeTemperatureLog extends TimerTask
{
	Integer newtemp;
	TemperatureSensor tsen;
	public ChangeTemperatureLog( TemperatureSensor tsen)
	{
		
		
		this.tsen=tsen;
	}
	public void run()
	{
		System.out.println("\n\nAfter 5 seconds !!!!\n\n");
		newtemp=ThreadLocalRandom.current().nextInt(0, 40);
		System.out.println("newtemp= "+tsen.getState().gettemp()+" in "+tsen.getState().getplace());
		
	   
	   try
	   {
		this.tsen.setState(newtemp);
		
	   }
	   catch (IOException e) 
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	   }
	  
	}

}
