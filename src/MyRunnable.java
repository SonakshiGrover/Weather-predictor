
import java.util.Timer;

public class MyRunnable implements Runnable 
{ 
	
	    String letter;
	    public MyRunnable(String letter)
	    {
	    	this.letter=letter;
	    }
	     public void run() 
	    {
	    	 
	    	  TemperatureSensor subject = new TemperatureSensor(35,this.letter);
	    	 // System.out.println("initial temp= "+subject.getState().gettemp()+ " in "+subject.getState().getplace());
		      
	    	  
	    	  SerializeTemperature WeatherLog= new SerializeTemperature(subject);
	    	  TemperaturePredictor1 BBC = new TemperaturePredictor1(subject);
	    	  TemperaturePredictor2 YahooWeather = new TemperaturePredictor2(subject);
	    	  GenerateStats GoogleWeatherStats = new GenerateStats(subject);
	    	  
	    	 
	    	 Timer timer = new Timer();
         	 timer.schedule(new ChangeTemperatureLog(subject), (long)0, (long)5000);
	        
		   
	    }
}

	
	

