package exercicioIcognitusSA;

import java.util.Date;

public class FuncionarioPJ extends Funcionario{
	private String cnpj;

	public FuncionarioPJ(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao,
			Date dataDemissao, String cnpj) {
		super(endereco, nome, cpf, setor, salarioBase, dataAdmissao, dataDemissao);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	
}
