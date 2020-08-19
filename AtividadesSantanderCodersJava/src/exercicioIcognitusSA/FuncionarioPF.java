package exercicioIcognitusSA;

import java.util.Date;

public class FuncionarioPF extends Funcionario{
	protected String nit;

	public FuncionarioPF(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, Date ultimasFerias) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao, ultimasFerias);
	}

}
