import java.util.ArrayList;
import java.util.Collections;

public class TemperaturePredictor2  extends Observer 
{

		public TemperaturePredictor2(TemperatureSensor subject)
		{
		      this.tempsensor_subject = subject;
		      this.tempsensor_subject.attach(this);
		}
		@Override
		public void update() 
		{
		    //System.out.println( "TemperaturePredictor2 updated in "+ this.tempsensor_subject.getState().getplace());
		    
		    	ArrayList<Integer> Intertemp = new ArrayList<Integer>();
		    	if(this.tempsensor_subject.getState().gettemplist().size()>9) 
		    	{
			    	for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=this.tempsensor_subject.getState().gettemplist().size()-10;i--) 
			    	{
			    		Intertemp.add(this.tempsensor_subject.getState().gettemplist().get(i));
			    	}
			    	Collections.sort(Intertemp);
			    	int median = (Intertemp.get(4) + Intertemp.get(5))/2;
			    	System.out.println("Next Temperature: (by predictor 2)= "+median/2+ " in "+ this.tempsensor_subject.getState().getplace());
			    	
		    	}
		    	else 
		    	{
			    	int median;
			    	for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=0;i--) 
			    	{
			    		Intertemp.add(this.tempsensor_subject.getState().gettemplist().get(i));
			    	}
			    	Collections.sort(Intertemp);
			    	//Collections.sort(Delhi);
			    	if(Intertemp.size()%2 == 0)
			    	{
			    		median = (Intertemp.get(Intertemp.size()/2) + Intertemp.get(Intertemp.size()/2 -1))/2;
			    	}
			    	else 
			    	{
			    		median =Intertemp.get(Intertemp.size()/2);
			    	}
			    	System.out.println("Next Temperature: (by predictor 2)= "+median+ " in "+ this.tempsensor_subject.getState().getplace());
			    	
		    	}
		    

		}
		
}