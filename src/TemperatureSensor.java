



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TemperatureSensor 
{
	
   private List<Observer> observer_list = new ArrayList<Observer>();
   private TemperatureLog templog_state;

   public TemperatureSensor(Integer a,String b)
   {
	   templog_state=new TemperatureLog(a,b);  
   }
   
   
   public TemperatureLog getState() {
      return templog_state;
   }

   public void setState(int temp) throws IOException {
      this.templog_state.settemp(temp);
      this.templog_state.setadd(temp);
      
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observer_list.add(observer);		
   }

   public void notifyAllObservers() throws IOException{
      for (Observer obs : observer_list) 
      {
         obs.update();
      }
   } 	
}



