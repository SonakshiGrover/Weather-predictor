/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */

import java.util.*;

public class GenerateStats extends Observer
{
		public GenerateStats(TemperatureSensor subject) 
		{
		      this.tempsensor_subject = subject;
		      this.tempsensor_subject.attach(this);
		}
		@Override
		public void update() 
		{
		   // System.out.println( "GenerateStats updated in "+ this.tempsensor_subject.getState().getplace()); 
		   
		    
		       int sum=0; int max; int min;
		
		       ArrayList<Integer> Intertemp = new ArrayList<Integer>();
		    	if(this.tempsensor_subject.getState().gettemplist().size()>99) 
		    	{
			    	for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=this.tempsensor_subject.getState().gettemplist().size()-100;i--)
			    	{
			    		Intertemp.add(this.tempsensor_subject.getState().gettemplist().get(i));
			    		sum+=this.tempsensor_subject.getState().gettemplist().get(i);
			    		
			    	}
			    	Collections.sort(Intertemp);
			    	int median = Intertemp.get(49) + Intertemp.get(50);
			    	int mean = sum/100;
			    	//System.out.println( "GenerateStats updated in "+ this.tempsensor_subject.getState().getplace()); 
					   
			    	System.out.println("Mean Temperature: "+mean+" in "+ this.tempsensor_subject.getState().getplace() );
			    	System.out.println("Median Temperature: "+median+" in "+ this.tempsensor_subject.getState().getplace());
			    	System.out.println("Maximum Temperature: "+ Intertemp.get(99)+ "in "+this.tempsensor_subject.getState().getplace());
			    	System.out.println("Minimum Temperature: "+ Intertemp.get(0)+ "in "+this.tempsensor_subject.getState().getplace());
		    	}
		    	else
		    	{
		    		for(int i=this.tempsensor_subject.getState().gettemplist().size()-1; i>=0;i--) 
		    		{
		    			Intertemp.add(this.tempsensor_subject.getState().gettemplist().get(i));
		    			sum+=this.tempsensor_subject.getState().gettemplist().get(i);
		    		}	
			    	int mean = sum/Intertemp.size();
			    	int median;
			    	Collections.sort(Intertemp);
			    	if(Intertemp.size()%2 == 0) 
			    	{
			    		median = (Intertemp.get(Intertemp.size()/2) + Intertemp.get((Intertemp.size()/2)-1))/2;
			    	}
			    	else 
			    	{
			    		median =Intertemp.get((Intertemp.size()/2));;
			    	}
			    	//System.out.println( "GenerateStats updated in "+ this.tempsensor_subject.getState().getplace()); 
					
			    	System.out.println("Mean Temperature: "+mean+ "in "+this.tempsensor_subject.getState().getplace());
			    	System.out.println("Median Temperature: "+median+ " in "+ this.tempsensor_subject.getState().getplace());
			    	System.out.println("Maximum Temperature: "+ Intertemp.get(Intertemp.size()-1)+" in "+this.tempsensor_subject.getState().getplace());
			    	System.out.println("Minimum Temperature: "+ Intertemp.get(0)+ " in "+this.tempsensor_subject.getState().getplace());
		    	}
		    }
		    
		
		
		
}