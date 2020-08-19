package exercicioIcognitusSA;

import java.util.Date;

public class Supervisor extends FuncionarioPF{

	public void getBonificacao() {
		var bonificacao = this.getSalarioBase() * 0.08;
	}

	public Supervisor(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, Date ultimasFerias) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, ultimasFerias);
	}
}
