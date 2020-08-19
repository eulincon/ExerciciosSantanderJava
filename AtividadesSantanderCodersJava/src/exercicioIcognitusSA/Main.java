package exercicioIcognitusSA;

import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2020, 0, 1);
//		var f2 = new FuncionarioPF(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, nit)
		var f1 = new FuncionarioPF("Mont Alvern", "Luana", "cpf", "Setor", 1095, c.getTime(), null, null);
		var s1 = new Supervisor("Dom José", "José", null, null, 2000, null, null, null);
		c.set(2018, 0, 1);
		var s2 = new Supervisor("Suit Suse", "Ana", null, null, 2431, c.getTime(), null, null);
		c.set(2015, 0, 1);
		var g1 = new Gerente("Lorem Atsum", "Maria", null, null, 5400, c.getTime(), null, null);
		c.set(2013, 0, 1);
		var g2 = new Gerente("Albert Einsten", "Rebeca", null, null, 10745, c.getTime(), null, null);

		c.set(2020, 5, 13);
		g1.setUltimasFerias(c.getTime());
		c.set(2019, 11, 1);
		g2.setUltimasFerias(c.getTime());

		g1.demitirFuncionario(g2, new Date());
		s1.demitirFuncionario(g1, new Date());
		s1.demitirFuncionario(f1, new Date());
		
		f1.trabalhar();
		
		s2.contraCheque();
		s2.getBonificacao();
		s2.contraCheque();
		
		g1.reajustarSalarioFuncionario(f1, 1230);
		g1.reajustarSalarioFuncionario(f1, 300);

//		System.out.println(f1.contadorDeMeses(f1.getUltimasFerias(), new Date()));
//		var result = f1.requisitarFerias();
//		f2.demitirFuncionario(f3, date2);

//		f2.solicitarAumento();

	}

}
