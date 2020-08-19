package exercicioIcognitusSA;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new FuncionarioPF(null, null, null, null, 0, null, null, null);
		Calendar c = Calendar.getInstance();
		Date date1 = new Date(), date2 = new Date();
		
		c.set(2019, 8, 13);
		date1.setTime(c.getTimeInMillis());
		f1.setDataAdmissao(date1);
		c.set(2020, 3, 1);
		date2.setTime(c.getTimeInMillis());
		f1.setUltimasFerias(date2);
		System.out.println(f1.contadorDeMeses(f1.getUltimasFerias(), new Date()));
		
		var result = f1.requisitarFerias();
		System.out.println(result);
		
	}

}
