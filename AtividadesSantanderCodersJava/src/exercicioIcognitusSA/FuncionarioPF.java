package exercicioIcognitusSA;

import java.util.Date;

public class FuncionarioPF extends Funcionario{
	protected String nit;

	public FuncionarioPF(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, String nit) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao);
		this.nit = nit;
	}

	
}
