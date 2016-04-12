/**
  * @author:  Sonakshi Grover 2014106 , Vrinda Malhotra 2014122
 */

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class Observer 
{
   protected TemperatureSensor tempsensor_subject;
   public abstract void update() throws IOException;
}
