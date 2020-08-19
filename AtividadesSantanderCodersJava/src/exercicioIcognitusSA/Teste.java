package exercicioIcognitusSA;

import java.util.Calendar;
import java.util.Date;

public class Teste { 
	
	
	public static void main(String[] args) {
		Date data1 = new Date(), data2 = new Date();

		Calendar c1 = Calendar.getInstance();
		c1.set(2020, 0, 1);
		data1.setTime(c1.getTimeInMillis());
		
		c1.set(2020, 11, 31);
		data2.setTime(c1.getTimeInMillis());

		System.out.println((data2.getTime() - data1.getTime())/1000/60/60/24);
		
		
	}
}
