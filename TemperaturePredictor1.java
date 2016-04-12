
/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */

public class TemperaturePredictor1  extends Observer
{

		public TemperaturePredictor1(TemperatureSensor subject)
		{
		      this.tempsensor_subject = subject;
		      this.tempsensor_subject.attach(this);
		}
		@Override
		public void update() 
		{
		      //System.out.println( "TemperaturePredictor1 updated in "+ this.tempsensor_subject.getState().getplace() ); 
		
		      int sum=0;
		    	if(this.tempsensor_subject.getState().gettemplist().size()>5)
		    	{
			    	for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=this.tempsensor_subject.getState().gettemplist().size()-5;i--) 
			    	{
			    		sum+=this.tempsensor_subject.getState().gettemplist().get(i);
			    	}
			    	int mean = sum/5;
			    	System.out.println("Next Temperature (by Predictor1): "+mean+ " in " +this.tempsensor_subject.getState().getplace());
		    	}
		    	else
		    	{
		    		for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=0;i--) 
		    		{
			    		sum+=this.tempsensor_subject.getState().gettemplist().get(i);
			    	}
			    	int mean = sum/this.tempsensor_subject.getState().gettemplist().size();
			    	System.out.println("Next Temperature (by Predictor1): "+mean+ " in " +this.tempsensor_subject.getState().getplace());
		    	
		    	}
		
		}
		
		
}
	
	



	
