
import java.util.*;

public class Bonus
{

	int newtemp;
	
	public long  createnewrandomnumber()
	{
		System.out.println("random number= ");
		return System.nanoTime()%40;  // current time in nano sec will always change 
		                              // to make it lie b/w 0 and 40 temperature we find remainder
			
	}
	
}
