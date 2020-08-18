package exercicioIcognitusSA;

import java.util.Date;

public class Gerente extends FuncionarioPF{
	
	
	public Gerente(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao);
	}

	public void getBonificacao() {
		var bonificacao = this.salarioBase * 0.12;
	}
}
