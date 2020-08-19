package exercicioIcognitusSA;

import java.util.Date;

public class Gerente extends FuncionarioPF{
	
	
	public Gerente(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, Date ultimasFerias) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, ultimasFerias);
	}

	public void getBonificacao() {
		var bonificacao = this.getSalarioBase() * 0.12;
	}
}
