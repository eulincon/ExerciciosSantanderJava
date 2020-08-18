package exercicioIcognitusSA;

import java.util.Date;

public class FuncionarioPF extends Funcionario{
	public FuncionarioPF(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao);
	}

	protected String nit;
}
