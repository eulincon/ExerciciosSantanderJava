package exercicioIcognitusSA;

import java.util.Date;

public class FuncionarioPJ extends Funcionario{
	protected String cnpj;

	public FuncionarioPJ(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, Date ultimasFerias, String cnpj) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, ultimasFerias);
	}

	
}
