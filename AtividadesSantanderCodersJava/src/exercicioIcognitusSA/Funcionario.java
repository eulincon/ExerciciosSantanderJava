package exercicioIcognitusSA;

import java.util.Date;

public abstract class Funcionario {
	protected String endereco;
	protected String nome;
	protected String cpf;
	protected String setor;
	protected double salarioBase;
	protected Date dataAdmissao;
	protected Date dataDemissao;
	protected Date ultimasFerias;
	
	public Funcionario(String endereco, String nome, String cpf, String setor, double salarioBase, Date dataAdmissao, Date dataDemissao) {
		super();
		this.endereco = endereco;
		this.nome = nome;
		this.cpf = cpf;
		this.setor = setor;
		this.salarioBase = salarioBase;
		this.dataAdmissao = dataAdmissao;
		this.dataDemissao = dataDemissao;
	}
	
	protected double contaCheque() {
		return this.salarioBase;
	}
	
	
}
